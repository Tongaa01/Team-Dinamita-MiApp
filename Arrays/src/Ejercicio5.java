import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Contar el número de elementos positivos, negativos y ceros de un array de 10 elementos.
        Scanner input=new Scanner(System.in);
        int positiveCounter=0,negativeCounter=0,zeroCounter=0;
        int [] numbers=new int[10];
        for (int p=0;p<numbers.length;p++){
            System.out.println("Ingrese el elemento "+(p+1));
            numbers[p]=input.nextInt();
            if (numbers[p]>0){
                positiveCounter++;
            } else if (numbers[p]<0) {
                negativeCounter++;
            } else if (numbers[p]==0) {
                zeroCounter++;
            }
        }
        System.out.println("La cantidad de elementos positivos es de:"+positiveCounter);
        System.out.println("La cantidad de elementos negativos es de:"+negativeCounter);
        System.out.println("La cantidad de elementos iguales a cero es de:"+zeroCounter);

        System.out.println("Elementos del arreglo:");
        for (int p=0;p<numbers.length;p++){
            System.out.println("Elemento "+(p+1));
            System.out.println(numbers[p]);
        }
    }
}