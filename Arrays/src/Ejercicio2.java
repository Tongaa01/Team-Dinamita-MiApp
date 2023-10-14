import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         //Leer 10 números enteros y guardarlos en un array.
         //Calcular la media de los números que estén en las posiciones pares.
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[10];
        int number,totalNumbers=0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese el numero "+(i+1));
            number=input.nextInt();
            numbers[i]=number;
        }
        for (int p=0;p<10;p++){
            if ((p+1)%2==0){
            totalNumbers=totalNumbers+numbers[p];
            }
        }
        System.out.println("El promedio de los numeros ingresados es de "+(totalNumbers/5));

    }
}