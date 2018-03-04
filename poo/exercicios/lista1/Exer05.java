package poo.exercicios.lista1;

import java.util.Scanner;

public class Exer05{
	public static void main(String[] args){
		int n1;
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("1 - Venda a vista no dinheiro\n2 - venda avista no debito\n3 - 1x no cartao de credito\n4 - 3x vezes com juros no cartao de crédito\n5 - 6x no cartao de credito \nDigite um numero:");
        n1 = scanner.nextInt();
        switch (n1){
            case 1:
                System.out.println("Desconto de 12%");
                break;
            case 2:
                System.out.println("Desconto de 3%");
                break;
            case 3:
                System.out.println("Mesmo preco");
                break;
            case 4:
                System.out.println("Acrescimo de 5%");
                break;
            case 5:
                System.out.println("Acrescimo de 10%");
                break;
			default:
		}
	}
}