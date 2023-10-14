import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Programa para generar un cuadrado mágico de orden N, siendo N un entero positivo e impar.
        //Un cuadrado mágico de orden N se construye siguiendo las siguientes reglas:
        //
        //El número 1 se coloca en la casilla central de la primera fila.
        //Cada número siguiente se coloca en la casilla correspondiente a la fila anterior y columna siguiente del último número que se ha introducido.
        //Si el número a introducir sigue a un múltiplo de N,  no se aplica la regla anterior sino que se coloca en la casilla de la fila posterior e igual columna.
        //Se considera que la fila anterior a la primera es la última y la columna posterior a la última es la primera.
        Scanner input=new Scanner(System.in);
        int N;
        boolean mult=false;
        while (true){
            System.out.println("Ingresa las dimensiones del cuadrado, ten en cuenta que numero debe ser un entero,impar,positivo y mayor a 2");
            N=input.nextInt();
            if (N<=2 || N%2==0){
                System.out.println("Error, el numero ingresado no es positivo, es par o menor a 2");

            }else {
                break;
            }
        }
        int i=0,p=(N/2);
        int [][] magicCube=new int[N][N];
        magicCube[0][(N/2)]=1;
        for (int number=2; number<=N*N;number++){
            if (!mult){
                i--;
                if (i<0){
                    i=N-1;
                }
                p++;
                if (p>=N){
                    p=0;
                }
            }else {
                i++;
                if (i >= N){
                    i = 0;
                }
            }
            magicCube[i][p]=number;
            if (number%N==0){
                mult=true;
            }else {
                mult=false;
            }

        }
        for (int j=0;j<N;j++){
            System.out.println(" ");
            for (int u=0;u<N;u++){
                System.out.print(magicCube[j][u]+" ");
            }
        }




    }   }
