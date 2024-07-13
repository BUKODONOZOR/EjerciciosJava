public class MatrizTranspuesta {

    // Función para calcular la transpuesta de una matriz
    public static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Crear una nueva matriz para la transpuesta con dimensiones invertidas
        int[][] transpuesta = new int[columnas][filas];

        // Intercambiar filas por columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplo de matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] transpuesta = calcularTranspuesta(matriz);

        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);
    }
}
