import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño de cada dimensión
        System.out.println("Ingrese el tamaño de la primera dimensión: ");
        int dim1 = input.nextInt();
        System.out.println("Ingrese el tamaño de la segunda dimensión: ");
        int dim2 = input.nextInt();
        System.out.println("Ingrese el tamaño de la tercera dimensión: ");
        int dim3 = input.nextInt();

        // Crear el arreglo de tres dimensiones
        String[][][] DatosTaller = new String[dim1][dim2][dim3];

        // Consumir el carácter de nueva línea pendiente
        input.nextLine();

        // Rellenar el arreglo con datos ingresados por el usuario
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                for (int k = 0; k < dim3; k++) {
                    System.out.println("Digite el nombre para [" + i + "][" + j + "][" + k + "]:");
                    DatosTaller[i][j][k] = input.nextLine();
                }
            }
        }

        // Mostrar el contenido del arreglo
        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                for (int k = 0; k < dim3; k++) {
                    System.out.println("Nombre en [" + i + "][" + j + "][" + k + "]: " + DatosTaller[i][j][k]);
                }
            }
        }
    }
}
