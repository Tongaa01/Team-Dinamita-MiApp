import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Leer 10 números enteros y mostrar la media de los valores positivos y la de los valores negativos.
        Scanner input=new Scanner(System.in);
        int positiveCounter=0,postiveTotal=0,negativeCounter=0,negativeTotal=0;
        int [] numbers=new int[10];
        for (int p=0;p<numbers.length;p++){
            System.out.println("Ingrese el elemento "+(p+1));
            numbers[p]=input.nextInt();
            if (numbers[p]>0){
                postiveTotal=numbers[p]+postiveTotal;
                positiveCounter++;
            } else if (numbers[p]<0) {
                negativeTotal=numbers[p]+negativeTotal;
                negativeCounter++;
            }
        }
        if (positiveCounter==0) {
            System.out.println("No se ingresaron elementos positivos");
        }else {
            System.out.println("La media de elementos positivos es de:" + (postiveTotal / positiveCounter));
        }
        if (negativeCounter==0){
            System.out.println("No se ingresaron elementos negativos");
        }else {
            System.out.println("La media de elementos negativos es de:" + (negativeTotal / negativeCounter));
        }

    }
}