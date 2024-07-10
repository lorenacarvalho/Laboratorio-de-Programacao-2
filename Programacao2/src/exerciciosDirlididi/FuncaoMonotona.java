/*
 * Laboratorio de Programação 2 - Lab 1
 *
 * @author Lorena Nascimento Carvalho - 123211071
 * */
package exerciciosDirlididi;

import java.util.Scanner;
import java.util.Arrays;

public class FuncaoMonotona {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int nums[] = new int[4]; //Cria um array de inteiros para guardar os numeros de entrada
    	boolean posCres = false;
    	boolean posDecres = false;
    	boolean iguais = false;
    	
    	// Preenche o array com os numeros digitados pelo usuario 
    	for (int i = 0; i < 4; i++){
        	nums[i] = scanner.nextInt();
    	}
    	
    	//Comparando os numeros 
    	for (int i = 0; i < (nums.length - 1); i++){
        	if (nums[i] == nums[i+1]){ //numeros iguais
            	iguais = true;
        	} else if (nums[i] > nums[i+1]) {
            	posDecres = true;
        	} else if (nums[i] < nums[i+1]) {
            	posCres = true;
        	}
    	}
    	
    	// Teste de condição para cada possibilidade de função
    	if (posDecres == true && posCres == false && iguais == false) {
        	System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
    	} else if (posCres == true && posDecres == false && iguais == false) {
        	System.out.println(("POSSIVELMENTE ESTRITAMENTE CRESCENTE"));
    	} else {
        	System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
    	}

	
	
	}
}