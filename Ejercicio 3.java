/**
 * @author Anderson Cedillo
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR");
        } else {
            System.out.println("El numero " + numero + " es IMPAR");
        }

        sc.close();
    }
}
