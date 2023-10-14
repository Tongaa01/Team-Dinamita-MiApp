import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         //Programa que lea por teclado 10 números enteros y los guarde en un array.
         //A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[10];
        int number,totalNumbers=0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese el numero "+(i+1));
            number=input.nextInt();
            numbers[i]=number;
        }
        for (int p=0;p<10;p++){
            totalNumbers=totalNumbers+numbers[p];
        }
        System.out.println("El promedio de los numeros ingresados es de "+(totalNumbers/10));

    }
}