package DesafioCatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livroList;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Jean Carlos", 2004);
        catalogoLivros.adicionarLivro("Livro 1", "Felipe Simões", 2006);
        catalogoLivros.adicionarLivro("Livro 2", "Jean Carlos", 2023);
        catalogoLivros.adicionarLivro("Livro 3", "Jean Carlos", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Jean Carlos"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2004, 2024));
    }
}
