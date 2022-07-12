package br.com.jaklyra;

import java.util.Scanner;

public class Calculadora {

    public static void tipoOperacao() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCALCULADORA");

        System.out.println("\nInforme a Operação desejada\n");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Voltar ao menu principal");

        int operacao = scanner.nextInt();


        switch (operacao) {

            case 1:
                Calculadora.soma();
                break;
            case 2:
                Calculadora.subtracao();
                break;
            case 3:
                Calculadora.multiplicacao();
                break;
            case 4:
                Calculadora.divisao();
                break;
            case 5:
                Main.menu();
                break;
            default:
                System.out.println("Informe uma opção válida");
                break;

        }

    }


    public static void soma() {

     double numero1 = getPrimeiroNumero();
     double numero2 = getSegundoNumero();

        double resultado = numero1 + numero2;

        System.out.println("\nA soma de " + numero1 + " mais " + numero2 + " é " + resultado);

       tipoOperacao();
    }

    public static void subtracao() {

        double numero1 = getPrimeiroNumero();
        double numero2 = getSegundoNumero();

        double resultado = numero1 - numero2;

        System.out.println("\nA subtração de " + numero1 + " mais " + numero2 + " é " + resultado);

       tipoOperacao();
    }

    public static void multiplicacao() {

        double numero1 = getPrimeiroNumero();
        double numero2 = getSegundoNumero();

        double resultado = numero1 * numero2;

        System.out.println("\nO resultado da multiplicação de " + numero1 + " mais " + numero2 + " é " + resultado);

        tipoOperacao();
    }

    public static void divisao() {

        double numero1 = getPrimeiroNumero();
        double numero2 = getSegundoNumero();

        double resultado = numero1 / numero2;

        System.out.println("\nO resultado da divisão de " + numero1 + " mais " + numero2 + " é " + resultado);

        tipoOperacao();
    }

    public static double getPrimeiroNumero() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o primeiro número");
        double num1 = leitor.nextDouble();

       return num1;
    }

    public static double getSegundoNumero() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o segundo número");
        double num2 = leitor.nextDouble();

        return num2;
    }

}