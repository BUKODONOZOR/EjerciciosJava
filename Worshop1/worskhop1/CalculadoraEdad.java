import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu año de nacimiento: ");
        int año = scanner.nextInt();

        System.out.print("Introduce tu mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce tu día de nacimiento: ");
        int dia = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        Period edad = Period.between(fechaNacimiento, fechaActual);

        System.out.println("Tienes " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " días.");
        if (edad.getYears() >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        scanner.close();
    }
}
