import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de Trabajos ");
        int MaxWorks = input.nextInt();

        // Consumir el carácter de nueva línea pendiente
        input.nextLine();

        String[][][] DatosTaller = new String[MaxWorks][2][2];

       DatosTaller[0][0][0] = "Vehiculo";
       DatosTaller[0][0][1] = "Vehiculo";
        DatosTaller[0][0][2] = "Vehiculo";

        DatosTaller[0][1][0] = "Nombre";
        DatosTaller[0][1][1] = "Nombre";
    }
}