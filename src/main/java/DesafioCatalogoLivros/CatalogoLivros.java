package DesafioCatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public List<Livro> livroList;

    public CatalogoLivros(List<Livro> livroList) {
        this.livroList = livroList;
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
        return livrosPorAno;
    }
}
