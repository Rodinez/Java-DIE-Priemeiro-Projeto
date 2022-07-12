package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int mutiplicar = mutiplicacao(a, b);
        int dividir = divisao(a,b);


        System.out.println("somar " + somar);
        System.out.println("sub " + subtrair);
        System.out.println("mult " + mutiplicar);
        System.out.println("div " + dividir);
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int mutiplicacao(int a, int b){
        return a * b;
    }

    public static int divisao(int a, int b){
        return a / b;
    }


}
