import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Programa Java para obtener la matriz transpuesta de una matriz.
        Scanner input=new Scanner(System.in);
        int [][] Array=new int[10][5];
        int [][] transArray=new int[5][10];
        Random rand=new Random();
        for (int i=0;i<10;i++){
            for (int p=0;p<5;p++) {
                Array[i][p] = rand.nextInt(1, 11);
                transArray[p][i] = Array[i][p];

            }
        }

        System.out.println("Elementos del arreglo basico:");
        for (int i=0;i<10;i++){
            for (int p=0;p<5;p++) {
                System.out.println("Elemento " + (i + 1)+","+(p+1));
                System.out.println(Array[i][p]);
            }

        }
        System.out.println("Elementos del arreglo transpuesto:");
        for (int p=0;p<5;p++){
            for (int i=0;i<10;i++) {
                System.out.println("Elemento " + (p + 1)+","+(i+1));
                System.out.println(transArray[p][i]);
            }

        }


    }   }
