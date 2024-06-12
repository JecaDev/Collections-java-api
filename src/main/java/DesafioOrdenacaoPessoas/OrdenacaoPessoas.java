package DesafioOrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    //Atributo
    private List<Pessoa> OrdenacaoPessoas;

    //Construtor
    public OrdenacaoPessoas(List<Pessoa> pessoas) {
        this.OrdenacaoPessoas = pessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        OrdenacaoPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(OrdenacaoPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(OrdenacaoPessoas);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }
}

class comparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas(new ArrayList<>());
        ordenacaoPessoas.adicionarPessoa("Jean", 20,1.82);
        ordenacaoPessoas.adicionarPessoa("Felipe", 21,1.75);
        ordenacaoPessoas.adicionarPessoa("Jonathan", 22,1.80);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
