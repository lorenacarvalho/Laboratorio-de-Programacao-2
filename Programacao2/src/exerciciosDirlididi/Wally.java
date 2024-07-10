package exerciciosDirlididi;
/*
* Laboratorio de Programação 2 - Lab 1
*
* @author Lorena Nascimento Carvalho - 123211071
*/

import java.util.Arrays;
import java.util.Scanner;

public class Wally {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String nome = "";
			String[] nomesPoss = scanner.nextLine().split(" ");
			boolean ehWally = false;
			
			for (int i = 0; i < nomesPoss.length; i++) {
				if (nomesPoss[i].equals("wally")) {
					ehWally = true;
					break;
				}else if (nomesPoss[i].length() == 5) {
					nome = nomesPoss[i];
				} else if (nome.equals("") && i == (nomesPoss.length - 1)) {
					nome = "?";
				}
			}
			
			if (ehWally) {
				break;
			}
			
			System.out.println(nome);
		}
		
		
		
		
		
		
	}
}
