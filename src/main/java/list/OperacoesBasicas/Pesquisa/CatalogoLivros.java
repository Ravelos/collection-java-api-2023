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

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Harry Potter", "J.K. Rowling", 1985);
        catalogoLivros.adicionarLivro("Cien Años de Soledad", "Gabriel Garcia Marquez", 1984);
        catalogoLivros.adicionarLivro("A Cidade das Feras", "Isabel Allende", 2000);
        catalogoLivros.adicionarLivro("El Abrazo del Padre", "Danilo Montero", 1985);

        System.out.println(catalogoLivros.pesquisarPorAutor("Gabriel Garcia Marquez"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1985,2000));
        System.out.println(catalogoLivros.pesquisarPorTitulo("A Cidade das Feras"));
    }
}
