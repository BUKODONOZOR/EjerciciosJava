import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el mensaje a cifrar: ");
        String mensaje = scanner.nextLine();

        System.out.print("Introduce el desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        String mensajeCifrado = cifrarCesar(mensaje, desplazamiento);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        String mensajeDescifrado = cifrarCesar(mensajeCifrado, -desplazamiento);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);

        scanner.close();
    }

    public static String cifrarCesar(String mensaje, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();

        for (char caracter : mensaje.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                resultado.append((char) ((caracter - base + desplazamiento + 26) % 26 + base));
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}
