package br.com.letscode.principal;

import br.com.letscode.dominio.Conta;
import br.com.letscode.dominio.ContaEspecial;
import br.com.letscode.dominio.ContaPoupanca;
import br.com.letscode.dominio.Pessoa;

public class MainContas {

    public static void main(String[] args) {
        Conta contas[] = new Conta[2];
        contas[0] = new ContaEspecial(1,"123");
        contas[1] = new ContaPoupanca(2,"123");
        Pessoa pessoa = new Pessoa("Cinthia");
        pessoa.setContas(contas);

        //TODO imprimir o saldo de cada conta;

        contas[0].imprimir();



    }
}
