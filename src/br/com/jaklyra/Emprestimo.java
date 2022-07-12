package br.com.jaklyra;

import java.util.Scanner;

public class Emprestimo {

    public static void menuEmprestimo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Empréstimos\n");

        System.out.println("Informe a opção desejada: ");

        System.out.println("1 - Simular Empréstimo");
        System.out.println("2 - Voltar ao menu principal");

       int opcao = scanner.nextInt();

       switch (opcao){

           case 1:
               tipoEmprestimo();
               break;
           case 2:
               Main.menu();
               break;
           default:
               System.out.println("Selecione uma opção válida");
               break;
       }


    }


    public static void tipoEmprestimo(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o valor que deseja emprestar");
        int valorEmprestimo = leitor.nextInt();
        System.out.println("Informe o número de parcelas");
        int numParcelas = leitor.nextInt();

        calcular(valorEmprestimo,numParcelas);

    }

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){

        return 0.3;
    }

    public static double getTaxaTresParcelas(){

        return 0.45;
    }


    public static void calcular(double valor, int parcelas){

        if (parcelas ==2){

            double valorFinal = valor * (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para duas parcelas: R$ " + valorFinal + "\n");

        }else if (parcelas==3){

            double valorFinal = valor * (valor * getTaxaTresParcelas());

            System.out.println("Valor final de empréstimos para 3 parcelas : R$ " + valorFinal + "\n");


        }else{

            System.out.println("Quantidade de parcelas não aceita");
        }

        menuEmprestimo();
    }

}
