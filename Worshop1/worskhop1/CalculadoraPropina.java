import java.util.Scanner;

public class CalculadoraPropina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el total de la cuenta: ");
        double cuenta = scanner.nextDouble();

        System.out.print("Introduce el porcentaje de propina que deseas dejar: ");
        double porcentaje = scanner.nextDouble();

        double propina = cuenta * (porcentaje / 100);
        System.out.println("La propina es: " + propina);

        scanner.close();
    }
}
