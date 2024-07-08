import java.util.Scanner;

public class CalculadoraDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();

        int dias;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = 0; // Mes inválido
                break;
        }

        if (dias != 0) {
            System.out.println("El mes tiene " + dias + " días.");
        } else {
            System.out.println("Mes inválido.");
        }

        scanner.close();
    }
}
