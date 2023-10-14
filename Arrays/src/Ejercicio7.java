import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Leer la altura de N personas y calcular la altura media
        // Mostra cuántos hay superiores a la media.
        Scanner input=new Scanner(System.in);
        int temp;
        double totalHeight=0,heightAverage=0;
        System.out.println("¿A cuantas personas hay que tomarle la altura?");
        temp=input.nextInt();
        String [] names = new String[temp];
        double [] height=new double[temp];
        for (int i=0;i<height.length;i++){
            System.out.println("Ingrese el nombre de la persona");
            names[i]=input.next();
            System.out.println("Ingrese la altura de "+names[i]);
            height[i]=input.nextDouble();
            totalHeight=totalHeight+height[i];
        }
        heightAverage=totalHeight/temp;
        System.out.println("La altura media es de "+heightAverage);
        for (int i=0;i<height.length;i++) {
            if (height[i] > heightAverage) {
                System.out.println(names[i] + " tiene una altura superior al promedio(" + height[i] + ")");
            }
        }

    }
}