package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " × " + i + " = " + (numero * i));
        }
    }
}