package B2;
import java.util.Scanner;
public class AreaDeUnCuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float area,perimetro,lado;
        System.out.println( " ingresa uno de los lados del cuadrado");
         lado = input.nextFloat();
         area = lado * lado;
         perimetro = lado * 4;
        System.out.println("el area del cuadrado es:"+ area + "cm2");
        System.out.println("el perimetro del cuadrado es:" + perimetro + "cm");
    }


}
