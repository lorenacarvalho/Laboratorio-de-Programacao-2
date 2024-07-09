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
    	int posCres = 0;
    	int posDecres = 0;
    	
    	// Preenche o array com os numeros digitados pelo usuario 
    	for (int i = 0; i < 4; i++){
        	nums[i] = scanner.nextInt();
    	}
    	System.out.println(Arrays.toString(nums));
    	
    	//Comparando os numeros 
    	for (int i = 0; i < (nums.length - 1); i++){
        	if (nums[i] == nums[i+1]){ //numeros iguais
        		System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        		break;
        	} else if (nums[i] > nums[i+1]) {
        		posDecres += 1;
        	} else if (nums[i] < nums[i+1]) {
        		posCres += 1;
        	}
        	
        	
        }
    	
    	if (posDecres > 0) {
    		System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
    	} else if(posCres > 0) {
    		System.out.println(("POSSIVELMENTE ESTRITAMENTE CRESCENTE"));
    	}
	}
   
}