import java.util.Scanner;

public class CalculoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Introduce la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Introduce la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (promedio >= 6) {
            System.out.println("El alumno aprueba con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno no aprueba. Su promedio es: " + promedio);
        }

        scanner.close();
    }
}
