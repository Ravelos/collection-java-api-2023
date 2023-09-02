package main.java.list.OperacoesBasicas.set;

public class Convidado {
    private String nome;
    private int CodigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        CodigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return CodigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", CodigoConvite=" + CodigoConvite +
                '}';
    }


}
