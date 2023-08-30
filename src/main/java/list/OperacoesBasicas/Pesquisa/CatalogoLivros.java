package main.java.list.OperacoesBasicas.Pesquisa;

import java.util.*;

public class CatalogoLivros {
//    attributos
    private List<Livro>livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for(Livro l:livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal ) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
