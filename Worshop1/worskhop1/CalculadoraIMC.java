import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Tu índice de masa corporal (IMC) es: " + imc);

        scanner.close();
    }
}
