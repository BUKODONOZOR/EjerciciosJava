
import java.util.*;

public class ElementosRepetidosFc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de elementos del array");
        int numeron = input.nextInt();

        System.out.println("");
        String[] ArrayElementos = new String[numeron];
        int i = 0;
        while (i < numeron){
            System.out.println("Ingrese el elemento");
            String elemento = input.nextLine();
            ArrayElementos[i] = elemento;


            i = i +1;
        }

        Map<String, Integer> contador = new HashMap<>();
        for (String num : ArrayElementos) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<String, Integer>> listaRepeticiones = new ArrayList<>(contador.entrySet());
        listaRepeticiones.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for(Map.Entry<String, Integer> Entrada: listaRepeticiones){
            System.out.println("Elemento :" + Entrada.getKey() +", Repeticiones:" + Entrada.getValue());
        }
    }
}
