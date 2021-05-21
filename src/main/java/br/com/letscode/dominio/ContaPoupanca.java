package br.com.letscode.dominio;

import br.com.letscode.exception.AutenticacaoException;
import br.com.letscode.exception.SaldoInsuficienteException;

import java.math.BigDecimal;

public class ContaPoupanca extends  ContaSimples{
    private BigDecimal taxa;
    public ContaPoupanca(int numero, String senha) {
        super(numero, senha);
        System.out.println("Criando um objeto da classe ContaPoupanca. \n Esta classe é filha da ContaSimples");
        this.taxa = new BigDecimal(0.07D);
    }

    @Override
    public void sacar(BigDecimal valor) throws AutenticacaoException, SaldoInsuficienteException {
        System.out.println("-- Método sobrescrito sacar chamado na classe ContaPoupança -- ");
        BigDecimal valorTaxa= valor.multiply(taxa);
        BigDecimal valorASerSacado= valor.add(valorTaxa);
        super.sacar(valorASerSacado);
    }

    @Override
    public void depositar(BigDecimal valor) throws AutenticacaoException {
        System.out.println("-- Método sobrescrito depositar chamado na classe ContaPoupança -- ");
        BigDecimal valorTaxa= valor.multiply(taxa);
        BigDecimal valorASerDepositado= valor.subtract(valorTaxa);
        super.depositar(valorASerDepositado);
    }
}
