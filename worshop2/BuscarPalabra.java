import java.util.Scanner;

public class BuscarPalabra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el texto");
        String texto = input.nextLine();

        System.out.println("ingrese la palabra a buscar");
        String palabrabuscada = input.nextLine();
        String[] ListaPalabras = texto.split(" ");
        int contador = 1;
        for(String palabra : ListaPalabras){

            if(palabra.equals(palabrabuscada))
            {
                System.out.println("Palabra encotrada en la posicion " + contador);

            }
            contador = contador + 1 ;
        }
    }
}
