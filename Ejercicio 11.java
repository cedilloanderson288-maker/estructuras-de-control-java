/**
 * @author Anderson Cedillo
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la nota " + i + ": ");
            double nota = sc.nextDouble();
            suma = suma + nota;
        }

        double promedio = suma / 5;
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
