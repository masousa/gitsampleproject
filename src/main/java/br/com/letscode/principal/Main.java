package br.com.letscode.principal;

import br.com.letscode.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Usuario> lista = new ArrayList<>();
        int soma=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da primeira pessoa: ");
            String nome1 = scanner.next();
            System.out.println("Digite a idade da primeira pessoa: ");
            Integer idade1 = Integer.parseInt(scanner.next());
            lista.add(new Usuario(nome1, idade1));
            soma=soma+idade1;
        }
        lista.sort(null);


        System.out.println("Pessoa Mais nova Nome: " + lista.get(0));
        System.out.println("Pessoa Mais nova Idade: " + lista.get(0).getIdade());
        System.out.println("Pessoa Mais velha Nome: " + lista.get(2));
        System.out.println("Pessoa Mais velha Idade: " + lista.get(2).getIdade());
        System.out.printf("A Média de idade é de %d %n", (soma/3));

    }
}
