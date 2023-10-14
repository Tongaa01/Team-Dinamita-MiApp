import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del empleado que más gana.
        Scanner input=new Scanner(System.in);
        double temp,maxSalaty=0;
        String [] names = new String[20];
        double [] salary=new double[20];
        for (int i=0;i<20;i++){
            System.out.println("Ingrese el nombre del empleado");
            names[i]=input.next();
            System.out.println("Ingrese el salario de "+names[i]);
            salary[i]=input.nextDouble();
            if (salary[i]>maxSalaty){
                maxSalaty=salary[i];
            }

        }
        for (int i=0;i<20;i++){
           if (salary[i]==maxSalaty){
               System.out.println("La persona con el salario mas alto fue "+names[i]+" con un salario de "+salary[i]+" pesos");
           }
        }


    }
}