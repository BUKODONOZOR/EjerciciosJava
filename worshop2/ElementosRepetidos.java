import java.util.*;

public class ElementosRepetidos {

    public static void main(String[] args) {
        // Ejemplo de array
        int[] array = {4, 2, 2, 8, 3, 3, 3, 4, 1, 4, 8, 8, 8};

        // Llamar a la función para contar y ordenar los elementos repetidos
        contarYOrdenarRepetidos(array);
    }

    public static void contarYOrdenarRepetidos(int[] array) {
        // Usar un mapa para contar las repeticiones de cada elemento
        Map<Integer, Integer> contador = new HashMap<>();

        for (int num : array) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        // Convertir el mapa a una lista de entradas y ordenarla por valor (repeticiones)
        List<Map.Entry<Integer, Integer>> listaRepeticiones = new ArrayList<>(contador.entrySet());
        listaRepeticiones.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Imprimir los elementos y sus repeticiones
        System.out.println("Elementos repetidos en orden de mayor a menor repetición:");
        for (Map.Entry<Integer, Integer> entrada : listaRepeticiones) {
            System.out.println("Elemento: " + entrada.getKey() + ", Repeticiones: " + entrada.getValue());
        }
    }
}
