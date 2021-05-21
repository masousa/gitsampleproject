package br.com.letscode.dominio;

import java.math.BigDecimal;

public class ContaEspecial extends ContaSimples{
    private BigDecimal limite;
    public ContaEspecial(int numero, String senha) {
        super(numero, senha);
        limite = new BigDecimal(200);
    }

    @Override
    public String imprimir() {
        return "Limite de "+this.limite+" e saldo de "+this.saldo+"\n totalizando "+limite.add(saldo);
    }
}
