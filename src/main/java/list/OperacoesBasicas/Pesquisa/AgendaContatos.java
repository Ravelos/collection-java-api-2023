package main.java.list.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Felipe", 1234);
        agendaContatos.adicionarContato("Felix", 1235);
        agendaContatos.adicionarContato("Felicia", 1236);
        agendaContatos.adicionarContato("Feli", 1237);
        agendaContatos.adicionarContato("Felix Catire", 1238);
        agendaContatos.exibirContatos();
        agendaContatos.atualizarNumeroContato("Felix", 2345);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Felix"));


    }
}
