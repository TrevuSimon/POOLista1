package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Escreva 10 numeros inteiros");
        for (int i = 0; i < 10; i++) {
            System.out.print(">");
            vet[i] = scan.nextInt();
            for (int j = i-1; j>=0 ;j--){
                if(vet[j] == vet[i]){
                    i--;
                    System.out.println("esse numero ja foi didigitado:");
                    for (int k = 0; k<i;k++ ) {
                        System.out.print(vet[k] + " ");
                    }
                }
            }
        }
    }
}
