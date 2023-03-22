package br.com.mdias.target.pergunta5;

import java.util.Scanner;

//Programa inverta os caracteres de um string
public class InverteString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String reverse = scan.next();
        char[] word = reverse.toCharArray();
        for (int i = reverse.length() -1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }
}
