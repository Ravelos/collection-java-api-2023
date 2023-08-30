package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item>itemList;
    public CarrinhoDeCompras(){ this.itemList=new ArrayList<>();
    } public void adicionarItem(String nome, int quantidade, double preco){ itemList.add(new Item(nome,quantidade,preco));
    }
}
