package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int vet[] = {0,0,0,0,0};
        System.out.println("Escreva 5 numeros inteiros");
        for (int i=0;i<5;i++){
            System.out.print(">");
            vet[i] = scan.nextInt();
        }

        for (int i=0;i<5;i++){
            System.out.println(i+" -> "+vet[i]);
        }
    }
}
