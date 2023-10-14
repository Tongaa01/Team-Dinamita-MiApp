import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Programa Java para sumar dos matrices de número enteros.
        Scanner input=new Scanner(System.in);
        int [][] Array1=new int[10][5];
        int [][] Array2=new int[10][5];
        int [][] sumArray=new int[10][5];
        Random rand=new Random();
        for (int i=0;i<10;i++){
            for (int p=0;p<5;p++) {
                Array1[i][p] = rand.nextInt(1, 11);
                Array2[i][p] = rand.nextInt(1, 11);
                sumArray[i][p] = Array1[i][p] + Array2[i][p];
            }
        }
        System.out.println("Elementos del arreglo 1:");
        for (int i=0;i<10;i++){
            for (int p=0;p<5;p++) {
                System.out.println("Elemento " + (i + 1)+","+(p+1));
                System.out.println(Array1[i][p]);
            }

        }
        System.out.println("Elementos del arreglo 2:");
        for (int i=0;i<10;i++){
            for (int p=0;p<5;p++) {
                System.out.println("Elemento " + (i + 1)+","+(p+1));
                System.out.println(Array2[i][p]);
            }

        }
        System.out.println("Elementos del arreglo suma:");
        for (int i=0;i<10;i++){
            for (int p=0;p<5;p++) {
                System.out.println("Elemento " + (i + 1)+","+(p+1));
                System.out.println(sumArray[i][p]);
            }

        }

    }   }
