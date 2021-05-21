package br.com.letscode.dominio;

import br.com.letscode.exception.AutenticacaoException;
import br.com.letscode.exception.SaldoInsuficienteException;

import java.math.BigDecimal;

public class ContaEspecial extends ContaSimples{
    private BigDecimal limite;
    public ContaEspecial(int numero, String senha) {
        super(numero, senha);
        System.out.println("Criando um objeto da classe ContaEspecial. \n Esta classe é filha da ContaSimples");
        limite = new BigDecimal(200);
    }

    @Override
    public String imprimir() {
        System.out.println("-- Método sobrescrito imprimir chamado na classe ContaEspecial -- ");

        return "Limite de "+this.limite+" e saldo de "+this.saldo+"\n totalizando "+limite.add(saldo);
    }

    @Override
    public void sacar(BigDecimal valor) throws SaldoInsuficienteException, AutenticacaoException {


        BigDecimal saldoSubtraido = saldo.subtract(valor);
        BigDecimal saldoLimiteSubtraido = BigDecimal.ZERO;
        if(saldoLimiteSubtraido.compareTo(BigDecimal.ZERO)<=0){
            saldoLimiteSubtraido = limite.add(saldoSubtraido);
        }
        //Não tem saldo mas tem limite
        if(saldoSubtraido.compareTo(BigDecimal.ZERO)<0 && saldoLimiteSubtraido.compareTo(BigDecimal.ZERO)>0){

            autenticar();
            saldo = BigDecimal.ZERO;
            limite = saldoLimiteSubtraido;
        }else if(saldoSubtraido.compareTo(BigDecimal.ZERO)<0 && saldoLimiteSubtraido.compareTo(BigDecimal.ZERO)<0){
            //não tem saldo nem limite
            throw  new SaldoInsuficienteException();
        }else{
            //tem saldo
            super.sacar(valor);
        }

    }

    @Override
    public void depositar(BigDecimal valor) throws AutenticacaoException {

        BigDecimal limiteCalculado = limite.add(valor);

        BigDecimal saldoRestante = valor;
        final BigDecimal valorTetoLimite = new BigDecimal(200);
        if(limiteCalculado.compareTo(valorTetoLimite)>0){
            saldoRestante = limiteCalculado.subtract(valorTetoLimite);
        }

        super.depositar(saldoRestante);
        limite = valorTetoLimite;
    }
}
