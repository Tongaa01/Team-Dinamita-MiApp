import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int rows = 5, columns = 4;
        int minorR, mayorR, minorC, mayorC;
        int [][] A = new int[rows][columns];

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                A[i][j] = reader.nextInt();
            }
        }
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.println("A["+i+"]["+j+"]="+A[i][j]);;
            }
        }
    }
}