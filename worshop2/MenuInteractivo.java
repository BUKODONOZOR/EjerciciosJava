import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] matriz = {
                {"+","-","*","/"},
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","0","D","="}
        };
        int respuesta = 0;

        double contador = 0;
        do{
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Dijite la posicion fila");
            int posicionf = input.nextInt();
            System.out.println("Dijite la posicion Columna");
            int posicionc = input.nextInt();
            respuesta = input.nextInt();


            double numeroobtenido = Double.parseDouble(matriz[posicionf][posicionc]);

            if (respuesta == 1){
                contador = contador + numeroobtenido;
            }
            if(respuesta == 2){
                contador = contador - numeroobtenido;
            }
            if (respuesta ==3){
                contador = contador * numeroobtenido;
            }

            System.out.println(numeroobtenido);
            System.out.println(contador);



        }while(respuesta != 6);

    }
}
