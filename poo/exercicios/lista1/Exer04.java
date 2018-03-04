package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer04{
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1,n2,n3,aux;

        System.out.println("Digite 3 numeros");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        if(n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n1 > n3){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n2 > n3){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.println(n1+" "+n2+" "+n3);
    }
}