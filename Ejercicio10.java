import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        while (true) {
            System.out.println("Dime tus notas");
            double num = teclado.nextDouble();
            if (num < 0) {
                break;
            }
            suma += num;
            contador++;
        }
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("Esta es tu media " + media);
        } else {
            System.out.println("No se han puesto notas");
        }
    }
}