import java.util.Scanner;

public class IdentificadorCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);

        if (Character.isLetter(caracter)) {
            if ("AEIOUaeiou".indexOf(caracter) != -1) {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }
        } else {
            System.out.println("Es un carácter especial.");
        }

        scanner.close();
    }
}
