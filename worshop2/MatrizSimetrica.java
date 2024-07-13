public class MatrizSimetrica {

    // Función para calcular la transpuesta de una matriz
    public static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    // Función para verificar si una matriz cuadrada es simétrica
    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;

        // Verificar que la matriz sea cuadrada
        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                return false; // No es cuadrada
            }
        }

        // Calcular la transpuesta de la matriz
        int[][] transpuesta = calcularTranspuesta(matriz);

        // Comparar la matriz original con su transpuesta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != transpuesta[i][j]) {
                    return false; // No es simétrica
                }
            }
        }

        return true; // Es simétrica
    }

    public static void main(String[] args) {
        // Ejemplo de matriz cuadrada
        int[][] matriz = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}
        };

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }
}
