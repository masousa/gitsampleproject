package br.com.letscode.dominio;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ContaSimples implements Conta{
    private int numero;
    protected BigDecimal saldo;
    private String senha;

    public ContaSimples(int numero,  String senha){
        this.numero = numero;
        this.senha = senha;
        saldo = new BigDecimal(0);

    }

    public int getNumero() {
        return numero;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String imprimir() {
        return "Saldo "+this.saldo.toString();
    }

    @Override
    public void sacar(BigDecimal valor) {

        saldo.subtract(valor);
    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo.add(valor);

    }

    @Override
    public void autenticar(int numero, String senha) {
        if(!(numero==this.numero && senha.equals(this.senha))) {
            // TODO gerar exceção;
        }


    }
}
