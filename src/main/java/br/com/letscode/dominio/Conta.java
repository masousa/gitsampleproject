package br.com.letscode.dominio;

import br.com.letscode.exception.AutenticacaoException;
import br.com.letscode.exception.SaldoInsuficienteException;

import java.math.BigDecimal;

public interface Conta {
    public String imprimir();
    public void sacar(BigDecimal valor) throws SaldoInsuficienteException, AutenticacaoException;
    public void depositar(BigDecimal valor) throws AutenticacaoException;
    public void autenticar() throws AutenticacaoException;
}
