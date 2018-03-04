package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer10{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = 1;
		int total = 0;
		while(n1 != 0){
			System.out.print(">");
			n1 = scan.nextInt();
			total += n1;
		}
		System.out.println("Total da soma:"+total);
	}
}