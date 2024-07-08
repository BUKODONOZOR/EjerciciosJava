import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia en kilómetros: ");
        double kilometros = scanner.nextDouble();

        double millas = kilometros / 1.60934;
        System.out.println("La distancia en millas es: " + millas);

        scanner.close();
    }
}
