import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
        // También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
        //Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos.
        Scanner input=new Scanner(System.in);
        int temp;
        double totalGrade=0,gradeAverage;
        System.out.println("¿Cuantos alumnos tiene la clase?");
        temp=input.nextInt();
        String [] students = new String[temp];
        double [] grades=new double[temp];
        for (int i=0;i<grades.length;i++){
            System.out.println("Ingrese el nombre del estudiante");
            students[i]=input.next();
            System.out.println("Ingrese la nota del alumno "+students[i]);
            grades[i]=input.nextDouble();
            totalGrade=totalGrade+grades[i];
        }
        gradeAverage=totalGrade/temp;
        System.out.println("La nota media es de "+gradeAverage);
        for (int i=0;i<grades.length;i++){
            if (grades[i]>gradeAverage){
                System.out.println("El alumno/a "+students[i]+" tiene una nota superior al promedio("+grades[i]+")");
            }

        }
    }
}