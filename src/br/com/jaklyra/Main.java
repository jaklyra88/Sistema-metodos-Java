package br.com.jaklyra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("BEM VINDO(A) AO SISTEMA INTEGRADO\n");

        menu();


    }


    public static void menu(){

        System.out.println("\nMenu Principal");

        Scanner scan = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a opção desejada ");

        System.out.println("1 - Mensagem");
        System.out.println("2 - Calculadora");
        System.out.println("3 - Empréstimo");
        System.out.println("4 - Sair do Sistema");

        int opcao = leitor.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Informe o horário");
                int horario = scan.nextInt();
                Mensagem.obterMensagem(horario);
                break;
            case 2:
                Calculadora.tipoOperacao();
                break;

            case 3:
                Emprestimo.menuEmprestimo();
                break;
            case 4:
                break;
            default:
                System.out.println("Informe uma opção válida");
                break;


        }

    }


}
