package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer06{
	public static void main(String[] args){
		int n1,n2;
        Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.print("1>");
			n1 = scanner.nextInt();
		}while(n1 < 0);
		
		do{
			System.out.print("2>");
			n2 = scanner.nextInt();
		}while(n2 < 0);
		
		System.out.println("1 - soma");
		System.out.println("2 - subtracao");
		System.out.println("3 - multiplicacao");
		System.out.println("4 - divisao");
		int esc = scanner.nextInt();
		
		switch(esc){
			case 1:
			n1 = n1 + n2;
				break;
			case 2:
			n1 = n1 - n2;
				break;
			case 3:
			n1 = n1 * n2;
				break;
			case 4:
			if(n2 > 0)n1 = n1 / n2;
				break;
			default:	
		}
		if(esc == 4 && n2 == 0){
			System.out.print("nao e possivel dividir por zero");
		}else{
			System.out.print("resultado = "+ n1);
		}			
	}
}