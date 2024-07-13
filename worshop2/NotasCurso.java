import java.util.Scanner;

public class NotasCurso
{

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Ingrese el numero de notas para ");
        int numeron = input.nextInt();
        int contador = 0;
        double[] notas = new double[numeron];
        do {


            System.out.println("Ingrese la nota numero" + contador);
            double notaa = input.nextDouble();

            notas[contador] = notaa;
            contador = contador +1;

        }while (contador < numeron);

        double suma = 0;
        for(double nota :notas)
        {
            suma = suma + nota;
        }
        System.out.println("TOTAl :" + suma);
        double promedio = suma / 8;
        double resto =  promedio * 8;


        double faltante  = (608 - resto) /8 ;
        System.out.println("Promedio :" + promedio +" faltante : " + faltante);



    }
}
