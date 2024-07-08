import java.util.Scanner;

public class VerificadorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        scanner.close();
    }
}
