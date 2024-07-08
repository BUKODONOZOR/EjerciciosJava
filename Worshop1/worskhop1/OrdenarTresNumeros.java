import java.util.Scanner;
import java.util.Arrays;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Números ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
