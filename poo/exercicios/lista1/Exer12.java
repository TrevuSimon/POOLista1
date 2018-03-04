package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        do {
            System.out.print("Escreva numero entre 0-10\n");
            System.out.print(">");
            n1 = scan.nextInt();
            System.out.print(">");
            n2 = scan.nextInt();
        }while(n1 == n2 && (n1 < 0 || n1 > 11) && (n2 < 0 || n2 > 11));

        for (int i=1;i<1000;i++) {
            if(((i%n1)==0)&&((i%n2)==0)){
                System.out.println(i+" é multiplo de "+n1+" e "+n2);
            }
        }
    }
}
