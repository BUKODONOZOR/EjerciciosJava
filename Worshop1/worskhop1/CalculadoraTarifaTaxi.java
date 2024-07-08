import java.util.Scanner;

public class CalculadoraTarifaTaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia recorrida en kilómetros: ");
        double kilometros = scanner.nextDouble();

        System.out.print("Introduce el costo por kilómetro: ");
        double costoPorKilometro = scanner.nextDouble();

        double tarifaBase = 50.0; // tarifa base fija
        double tarifaTotal = tarifaBase + (kilometros * costoPorKilometro);

        System.out.println("La tarifa total del taxi es: " + tarifaTotal);

        scanner.close();
    }
}
