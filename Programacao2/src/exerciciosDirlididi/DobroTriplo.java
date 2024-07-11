/* token: fs5LEDns6GPA
 * Laboratorio de Programação 2 - Lab 1
 *
 * @author Lorena Nascimento Carvalho - 123211071
 * */

import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int dobro = num1 * 2;
        int triplo = num1 * 3;

        System.out.println("dobro: " + dobro + ", triplo: " + triplo);

    }

}
