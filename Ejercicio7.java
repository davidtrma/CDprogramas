import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String combinacionCorrecta = "1234";
        int intentosMaximos = 4;
        int intentosRealizados = 0;

        Scanner teclado = new Scanner(System.in);

        while (intentosRealizados < intentosMaximos) {
            System.out.print("Introduce la combinación de 4 cifras:");
            String combinacionIngresada = teclado.next();

            if (combinacionIngresada.equals(combinacionCorrecta)) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentosRealizados++;
            }
        }

        if (intentosRealizados == intentosMaximos) {
            System.out.println("Has agotado tus intentos. La caja fuerte permanece cerrada.");
        }
    }
}
