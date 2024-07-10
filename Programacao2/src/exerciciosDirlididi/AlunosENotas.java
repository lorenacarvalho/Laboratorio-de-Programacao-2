/*
* Laboratorio de Programação 2 - Lab 1
*
* @author Lorena Nascimento Carvalho - 123211071
*/

package exerciciosDirlididi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlunosENotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> notas = new ArrayList<Integer>();
		int maiorNota;
		int menorNota;
		int soma = 0;
		int media = 0;
		int qtdAcima = 0;
		int qtdAbaixo = 0;
		
		while (true) {
			
			String[] linha = scanner.nextLine().split(" ");
			if (linha[0].equals("-")) {
				break;
			}	
			notas.add(Integer.parseInt(linha[1]));	
			
		}
		
		maiorNota = Collections.max(notas);
		menorNota = Collections.min(notas);
			
		for (int nota: notas) {
			soma += nota;
			if (nota >= 700) {
				qtdAcima += 1;
			} else {
				qtdAbaixo += 1;
			}
		}
			
		media = soma / notas.size();
		
		System.out.println("maior: " + maiorNota);
		System.out.println("menor: " + menorNota);
		System.out.println("media: " + media);
		System.out.println("acima: " + qtdAcima);
		System.out.println("abaixo: " + qtdAbaixo);
		
			
		

			
			
			
	}
}
