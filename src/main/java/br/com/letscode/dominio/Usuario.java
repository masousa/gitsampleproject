package br.com.letscode.dominio;

public class Usuario implements Comparable<Usuario>{
    private String nome;
    private  int idade;


    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }


    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }
    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.getIdade() - o.getIdade();
    }

}
