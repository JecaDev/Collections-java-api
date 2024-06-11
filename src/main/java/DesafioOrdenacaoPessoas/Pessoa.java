package DesafioOrdenacaoPessoas;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    //Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    //Implementação do método abstrato da Interface
    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return "Pessoa {" +
                " nome: " + nome + ", idade= " + idade + ", altura= " + altura + "}";
    }


}