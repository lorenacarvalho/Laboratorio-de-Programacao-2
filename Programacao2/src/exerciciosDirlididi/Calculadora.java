/*
 * Laboratorio de Programação 2 - Lab 1
 *
 * @author Lorena Nascimento Carvalho - 123211071
 * */
package exerciciosDirlididi;

import java.util.*;
public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacao = sc.nextLine(); 
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float result;
		switch (operacao) {
		case ("+"):
			result = num1 + num2;
			System.out.println("RESULTADO: " + result);
			break;
		case ("-"):
			result = num1 - num2;
			System.out.println("RESULTADO: " + result);
			break;
		case ("*"):
			result = num1 * num2;
			System.out.println("RESULTADO: " + result);
			break;
		case ("/"):
			if (num2 == 0) {
				System.out.println("ERRO");
				break;
			}
			
			result = num1 / num2;
			System.out.println("RESULTADO: " + result);
			break;
		default: 
			System.out.println("ENTRADA INVALIDA");
			break;
		}
		
		
		
		

	}

}
