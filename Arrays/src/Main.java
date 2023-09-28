import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_1[];
        num_1 = new int[4];
        Scanner reader = new Scanner(System.in);
        for (int i=0; i<num_1.length;i++){
            System.out.println("Ingrese un número:");
            num_1[i] = reader.nextInt();
        }
        multiplicarPorDos(num_1);
    }


    public static void multiplicarPorDos(int[] numbers) {
        int result;
        for (int i=0; i<numbers.length;i++){
            result = numbers[i] * 2;
            System.out.println(result);
        }

    }
}