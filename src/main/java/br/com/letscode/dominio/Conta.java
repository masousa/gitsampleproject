package br.com.letscode.dominio;

import java.math.BigDecimal;

public interface Conta {
    public String imprimir();
    public void sacar(BigDecimal valor);
    public void depositar(BigDecimal valor);
    public void autenticar(int numero, String senha);
}
