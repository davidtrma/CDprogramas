import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroInicio = scanner.nextInt();

        System.out.println("\t\tNúmero\tCuadrado\tCubo");


        for (int i = 0; i < 5; i++) {
            int num = numeroInicio + i;
            int cuadrado = num * num;
            int cubo = num * num * num;

            System.out.println("\t\t" + num + "\t\t" + cuadrado + "\t\t" + cubo);

        }
    }
}