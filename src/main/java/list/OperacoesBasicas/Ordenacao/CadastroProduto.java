package main.java.list.OperacoesBasicas.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "lavalouça", 1.22, 1);
        cadastroProduto.adicionarProduto(2, "monitor", 3000, 40);
        cadastroProduto.adicionarProduto(3, "celular", 100.22, 50);
        cadastroProduto.adicionarProduto(4, "tv", 21.22, 60);
        cadastroProduto.adicionarProduto(5, "sapato", 31.22, 70);
        System.out.println(cadastroProduto.produtoSet);
        System.out.println(cadastroProduto.exibirPorPreco());
        System.out.println(cadastroProduto.exibirProdutosPorNome());
//        cadastroProduto.exibirPorPreco();
//        cadastroProduto.exibirProdutosPorNome();
//        cadastroProduto.exibirPorPreco();

    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

}
