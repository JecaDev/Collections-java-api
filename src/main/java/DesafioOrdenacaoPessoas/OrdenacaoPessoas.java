package DesafioOrdenacaoPessoas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    //Atributo
    private List<Pessoa> OrdenacaoPessoas;

    //Construtor
    public OrdenacaoPessoas(List<Pessoa> pessoas) {
        this.OrdenacaoPessoas = pessoas;
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        OrdenacaoPessoas.add(new Pessoa(nome, idade, altura));
    }
    public List ordenarPorIdade(){

        return ordenarPorIdade();
    }
    ordenarPorAltura(){

    }
}
