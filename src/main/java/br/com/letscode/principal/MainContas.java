package br.com.letscode.principal;

import br.com.letscode.dominio.Conta;
import br.com.letscode.dominio.ContaEspecial;
import br.com.letscode.dominio.ContaPoupanca;
import br.com.letscode.dominio.Pessoa;
import br.com.letscode.exception.AutenticacaoException;
import br.com.letscode.exception.SaldoInsuficienteException;

import java.math.BigDecimal;

public class MainContas {

    public static void main(String[] args) {
        Conta contas[] = new Conta[2];
        contas[0] = new ContaEspecial(1,"123");
        contas[1] = new ContaPoupanca(2,"123");
        Pessoa pessoa = new Pessoa("Cinthia");
        pessoa.setContas(contas);


        try {
            for (int i = 0; i < pessoa.getContas().length; i++) {
                Conta conta = pessoa.getContas()[i];
                conta.depositar(new BigDecimal(100));
                conta.sacar(new BigDecimal(150));
                conta.depositar(new BigDecimal(200));
                System.out.println(conta.imprimir());
            }
        }catch (AutenticacaoException | SaldoInsuficienteException exception){
            exception.printStackTrace();
            System.err.println("Error "+exception.getMessage());
        }



    }
}
