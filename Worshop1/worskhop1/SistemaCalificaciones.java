import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la calificación: ");
        int calificacion = scanner.nextInt();

        String resultado;

        if (calificacion >= 90) {
            resultado = "A";
        } else if (calificacion >= 80) {
            resultado = "B";
        } else if (calificacion >= 70) {
            resultado = "C";
        } else if (calificacion >= 60) {
            resultado = "D";
        } else {
            resultado = "F";
        }

        System.out.println("La calificación es: " + resultado);

        scanner.close();
    }
}
