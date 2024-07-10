/*
* Laboratorio de Programação 2 - Lab 1
*
* @author Lorena Nascimento Carvalho - 123211071
*/

package exerciciosDirlididi;

import java.util.Scanner;

public class AcimaDaMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] elementos = scanner.nextLine().split(" ");
		int[] numeros = new int[elementos.length];
		int soma = 0;
		int media= 0;
		int num;
		String numsAcima = "";
		
		for (int i = 0; i < elementos.length; i++) {
			num = Integer.parseInt(elementos[i]);
			soma += num;
			numeros[i] = num;
		}

		media = soma / elementos.length;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				numsAcima += " " + elementos[i];
				
			}
		}
		
		
		System.out.println(numsAcima.trim());
		
	}

}
