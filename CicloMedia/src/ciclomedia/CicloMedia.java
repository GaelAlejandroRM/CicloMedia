
package ciclomedia;

import java.util.Scanner;

public class CicloMedia {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;
        double media = 0;

        System.out.println("Calculadora de media");
        System.out.println("Ingrese los números (ingrese una letra o un simbolo para terminar):");

        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            total += numero;
            count++;
        }

        if (count > 0) {
            media = (double) total / count;
            System.out.println("La media de los números ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
}