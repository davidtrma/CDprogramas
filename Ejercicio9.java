import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long num = teclado.nextLong();

        long numeroAbsoluto = Math.abs(num);

        int contador = 0;

        do {
            numeroAbsoluto /= 10;
            contador++;
        } while (numeroAbsoluto > 0.99);

        System.out.println("El número tiene " + contador + " dígitos.");

        teclado.close();
    }
}
