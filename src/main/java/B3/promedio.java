package B3;

import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int califi[] = new int[5];
       int sum = 0;
       double promedio;

        System.out.println("ingrese la nota del primer estudiante");
        califi[0] = scanner.nextInt();

        System.out.println("ingrese la nota del segundo estudiante");
        califi[1] = scanner.nextInt();

        System.out.println("ingrese la nota del tercer estudiante");
        califi[2] = scanner.nextInt();

        System.out.println("ingrese la nota del cuarto estudiante");
        califi[3] = scanner.nextInt();

        System.out.println("ingrese la nota del quinto5 estudiante");
        califi[4] = scanner.nextInt();


       for (int i=0; i<califi.length; i++){
           sum+=califi[i];
       }
       promedio = (sum/ califi.length);
       System.out.println("el promedio de las notas de los 5 estudiantes es: " + promedio);


    }

}
