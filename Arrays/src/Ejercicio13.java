import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Programa que genera un cuadrado latino de orden N.
        Scanner input=new Scanner(System.in);
        int N;
        while (true){
            System.out.println("Ingresa las dimensiones del cuadrado, ten en cuenta que numero debe ser un entero y positivo");
            N=input.nextInt();
            if (N<0 ){
                System.out.println("Error, el numero ingresado no es positivo");
            }else {
                break;
            }
        }
        int[][] latinCube=new int[N][N];
        Random rand=new Random();
        for (int i=0;i<N;i++){
            latinCube[0][i]=rand.nextInt(1,11);
        }
        for (int i=1;i<N;i++){
            for (int p=0;p<N;p++){
                if ((p-1)<0){
                    latinCube[i][p]=latinCube[i-1][N-1];
                } else if (p+1>N) {
                    latinCube[i][p]=latinCube[i-1][0];
                }else {
                    latinCube[i][p]=latinCube[i-1][p-1];
                }

            }
        }

        for (int j=0;j<N;j++){
            System.out.println(" ");
            for (int u=0;u<N;u++){
                System.out.print(latinCube[j][u]+" ");
            }
        }




    }   }
