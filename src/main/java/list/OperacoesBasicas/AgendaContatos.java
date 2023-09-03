package main.java.list.OperacoesBasicas;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Raul",2345678);
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Marcos",2345672);
        agendaContatos.adicionarContato("Freddy",2345674);
        agendaContatos.adicionarContato("Francisco",2345677);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Marcos");
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Raul");

    }
}
