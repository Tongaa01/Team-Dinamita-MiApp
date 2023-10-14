import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Llenar un array con números aleatorios
        Scanner input=new Scanner(System.in);
        int [] randNumbers=new int[10];
        Random rand=new Random();
        for (int i=0;i<10;i++){
            randNumbers[i]=rand.nextInt(1,11);
        }
        System.out.println("Elementos del arreglo:");
        for (int p=0;p<10;p++){
            System.out.println("Elemento "+(p+1));
            System.out.println(randNumbers[p]);




        }

    }   }
