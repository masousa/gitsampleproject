package br.com.letscode.exception;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(){
        super("Não há saldo suficiente para esta operação");
    }
}
