package br.com.mdias.target.pergunta2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int sequencia = 15;

        List<Integer> list = new ArrayList<>();
        //Loop for para calcular a sequência Fibonacci e condição if para filtrar se o número de entrada faz parte da sequência
        for (int i = 0; i <= sequencia; i++ ){
            a += b;
            b = a -b;
            list.add(b);
        }
        System.out.println("Sequência Fibonacci "+list);
        if (list.contains(sequencia)){
            System.out.println("Número informado "+sequencia+" pertence à sequência Fibonacci");
        }else{
            System.out.println("Número informado "+sequencia+" não pertence à sequência Fibonacci");
        }
    }
}
