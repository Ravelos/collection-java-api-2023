package main.java.list.OperacoesBasicas.Ordenacao;

import main.java.list.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento>eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry: eventoMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento será "+ entry.getValue()+" na data "+ entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,12),"Bautizo","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER,12),"Casorio","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY,12),"Divorcio","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER,12),"Nacimiento","Atração 1");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
