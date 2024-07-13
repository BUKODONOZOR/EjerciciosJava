import java.util.Scanner;

public class Reservas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de números de filas ");
        int numerof = input.nextInt();

        System.out.println("Ingrese el número de números de columnas ");
        int numeroc = input.nextInt();


        boolean[][] numeros = new boolean[numerof][numeroc];

        for(int i = 0; i<numerof; i = i +1){

            for(int z = 0; z<numeroc; z =z +1){
                 numeros[i][z] = true;
            }
        }
        String respuesta = "si";
        do{
            for(int i = 0; i<numerof; i = i +1){

                for(int z = 0; z<numeroc; z =z +1){
                    System.out.print(numeros[i][z] + " ");
                }
                System.out.println();
            }

            System.out.println("Dijite el numero de la fila que quiere cambiar");
            int numerofc = input.nextInt();
            System.out.println("Dijite el columna de la fila que quiere cambiar");
            int numerocc = input.nextInt();

            numeros[numerofc][numerocc] = false;

            System.out.println("Quieres continuar?");
             respuesta = input.nextLine();
        }while (respuesta != "si");

    }
}
