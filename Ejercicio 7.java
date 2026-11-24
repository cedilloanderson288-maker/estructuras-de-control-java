/**
 * @author Anderson Cedillo
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        int suma = 0;
        int numero;

        System.out.println("Ingrese numeros positivos (negativo para terminar): ");
        numero = sc.nextInt();

        while (numero >= 0) {
            cantidad = cantidad + 1;
            suma = suma + numero;
            System.out.println("Ingrese otro numero: ");
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        sc.close();
    }
}
