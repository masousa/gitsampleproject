package br.com.letscode.dominio;

import br.com.letscode.exception.AutenticacaoException;
import br.com.letscode.exception.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaSimples implements Conta{
    private int numero;
    protected BigDecimal saldo;
    private String senha;

    public ContaSimples(int numero,  String senha){
        System.out.println("Criando um objeto da conta simples. \n Esse método pode ser chamado ao criar um objeto do tipo Conta Simples ou um dos seus filhos através da palavra super no seu construtor");
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
    public void sacar(BigDecimal valor) throws SaldoInsuficienteException, AutenticacaoException{
        autenticar();
        System.out.println("-- Método sacar chamado na classe ContaSimples -- ");
        final BigDecimal subtract = saldo.subtract(valor);
        if(subtract.compareTo(BigDecimal.ZERO)>0){
            saldo = subtract;
        }else{
            throw new SaldoInsuficienteException();
        }
    }

    @Override
    public void depositar(BigDecimal valor) throws AutenticacaoException{
        autenticar();
        System.out.println("-- Método depositar chamado na classe ContaSimples -- ");
        saldo = saldo.add(valor);

    }

    @Override
    public void autenticar() throws AutenticacaoException{
        System.out.println("-- Método autenticar chamado na classe ContaSimples -- ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a senha do usuário");
        String senhaFornecida = scanner.next();
        if(!(senhaFornecida.equals(this.senha))) {
            throw new AutenticacaoException();
        }


    }
}
