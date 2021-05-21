package br.com.letscode.dominio;

import java.math.BigDecimal;

public class ContaPoupanca extends  ContaSimples{
    private BigDecimal taxa;
    public ContaPoupanca(int numero, String senha) {
        super(numero, senha);
        this.taxa = new BigDecimal(0.07D);
    }

    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal valorCorrigido= valor.subtract(taxa);
        super.sacar(valorCorrigido);
    }

    @Override
    public void depositar(BigDecimal valor) {
        BigDecimal valorCorrigido= valor.subtract(taxa);
        super.depositar(valorCorrigido);
    }
}
