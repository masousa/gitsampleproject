package br.com.letscode.dominio;

public class Pessoa {
    private String nome;
    Conta[] contas;

    public Pessoa(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }
}
