import java.util.Scanner;

public class CalculadoraDescuentos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el total de su compra");

        double totalcompra = input.nextDouble();
        double descuento = 0;
        if (totalcompra < 200) {
            descuento = totalcompra * 0.10;
        }
        if (totalcompra >= 300) {
            descuento = totalcompra * 0.15;
        }
        if (totalcompra >= 500) {
            descuento = totalcompra * 0.20;
        }
        if (totalcompra >= 1000) {
            descuento = totalcompra * 0.25;
        }

        double totalpagar = totalcompra - descuento;

        System.out.println("Total a pagar: " + totalpagar);

    }
}