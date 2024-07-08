import java.util.Scanner;

public class ContrasenaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String contrasena = scanner.nextLine();

        if (esContrasenaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }

        scanner.close();
    }

    public static boolean esContrasenaSegura(String contrasena) {
        if (contrasena.length() < 8) return false;

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneCaracterEspecial = false;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            else if (Character.isLowerCase(c)) tieneMinuscula = true;
            else if (!Character.isLetterOrDigit(c)) tieneCaracterEspecial = true;
        }

        return tieneMayuscula && tieneMinuscula && tieneCaracterEspecial;
    }
}
