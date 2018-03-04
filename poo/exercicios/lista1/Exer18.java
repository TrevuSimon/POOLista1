package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vet[] = {0,0,0,0,0,0,0,0,0,0};
        System.out.println("Escreva 10 numeros inteiros");
        for (int i=0;i<10;i++){
            System.out.print(">");
            vet[i] = scan.nextInt();
        }

        for(int i = 0;i<9;i++){
            int t = i;
            for(int j=i+1;j<10;j++){
                if(vet[j] < vet[t]){
                    t = j;
                }
            }
            if(t != i){
                int aux =  vet[i];
                vet[i] = vet[t];
                vet[t] = aux;
            }
        }

        for (int i=0;i<10;i++){
            System.out.println(i+" -> "+vet[i]);
        }
    }
}
