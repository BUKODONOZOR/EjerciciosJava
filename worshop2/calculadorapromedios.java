import java.util.*;

public class calculadorapromedios {


     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Ingrese el número de números que vamos a calcular");
         int numeron = input.nextInt();


         double[] numeros = new double[numeron];

         for(int i = 1 ; i <= numeron ; i = i + 1 )
         {
            System.out.println("Ingrese el numero" + i);
            double numeroactual = input.nextDouble();
            numeros[i-1] = numeroactual;
         }
         double suma = 0;

         for(double numero : numeros){
             suma = suma + numero;
         }
         double promedio = (suma/numeron);

         System.out.println("El promedio de los numeros es: "+promedio);
    }


}
