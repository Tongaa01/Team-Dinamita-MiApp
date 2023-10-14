import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Programa que crea un array de 20 elementos
        //  llamado Pares y guarde los 20 primeros
        //  números pares.
        //  Mostrar por pantalla el contenido
        //  del array creado
        Scanner input=new Scanner(System.in);
        int number=0,i=0;
        int [] even=new int[20];
        while (true){
            number=number+1;
            if (number%2==0){
                even[i]=number;
                i++;
            }
            if (i==20){
                break;
            }
        }
        System.out.println("Elementos del arreglo:");
        for (int p=0;p<even.length;p++){
            System.out.println("Elemento "+(p+1));
            System.out.println(even[p]);
        }
    }
}