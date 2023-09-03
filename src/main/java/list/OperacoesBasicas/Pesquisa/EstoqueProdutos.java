package main.java.list.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod,new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValoTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1,"produto1",3.43,45);
        estoqueProdutos.exibirProdutos();
        estoqueProdutos.adicionarProduto(1,"produto1",3.43,45);
        estoqueProdutos.adicionarProduto(2,"produto2",4.43,100);
        estoqueProdutos.adicionarProduto(3,"produto3",5.43,20);
        estoqueProdutos.adicionarProduto(4,"produto4",6.43,15);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calculaValoTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

    }
}
