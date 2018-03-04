package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n1,n2;
		
		System.out.print("1>");
		n1 = scanner.nextInt();
		System.out.print("2>");
		n2 = scanner.nextInt();
		
		if(n1 < n2)System.out.println(n1);
		else	   System.out.println(n2);
	}
}
