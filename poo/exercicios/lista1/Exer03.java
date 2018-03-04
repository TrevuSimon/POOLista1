package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer03{
	public static void main(String[] args){
		int n1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero:");
        n1 = scanner.nextInt();
        switch (n1){
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("marco");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("sgosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("outubro");
                break;
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
		}
	}
}
