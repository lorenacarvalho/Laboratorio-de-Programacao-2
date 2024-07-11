/*
* Laboratorio de Programação 2 - Lab 1
*
* @author Lorena Nascimento Carvalho - 123211071
*/

package exerciciosDirlididi;

import java.util.Arrays;
import java.util.Scanner;

public class AlunosENotas {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int[] notas;
    	int maiorNota, menorNota;
    	int soma = 0;
    	int media = 0;
    	int qtdAcima = 0;
    	int qtdAbaixo = 0;
    	String notasString = "";

    	while (true){
        	String[] linha = scanner.nextLine().split(" ");
        	if (linha[0].equals("-")){
            	break;
        	}

        	notasString += " " + linha[1];

    	}

    	notasString = notasString.trim();
    	String[] linhaNumeros = notasString.split(" ");
    	notas = new int[linhaNumeros.length];

    	for (int i = 0; i < linhaNumeros.length; i++){
        	notas[i] = Integer.parseInt(linhaNumeros[i]);

    	}

    	for (int nota: notas) {
        	soma += nota;
        	if (nota >= 700) {
            	qtdAcima += 1;
        	} else {
            	qtdAbaixo += 1;
        	}
    	}

    	maiorNota = notas[0];
    	menorNota = notas[0];

    	for (int n: notas){
        	if (n > maiorNota){
            	maiorNota = n;
        	}

        	if (n < menorNota){
            	menorNota = n;
        	}

    	}

    	media = soma / notas.length;

    	System.out.println("maior: " + maiorNota);
    	System.out.println("menor: " + menorNota);
    	System.out.println("media: " + media);
    	System.out.println("acima: " + qtdAcima);
    	System.out.println("abaixo: " + qtdAbaixo);





	}
}

