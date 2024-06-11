package DesafioListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo
    private static List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
    }

    void removerTarefa(String descricao){

        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            TarefasParaRemover.add(t);

            }
        }
        tarefaList.removeAll(TarefasParaRemover);
    }
    public static int obterNumeroTotalTarefas(){

        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Você tem " + ListaTarefas.obterNumeroTotalTarefas() + " Tarefas pendentes");
    }
}
