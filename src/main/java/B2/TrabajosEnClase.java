package B2;
import java.util.Scanner;
public class TrabajosEnClase {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float PrecioDedolar = 4054f;
            System.out.println("ingrese la cantidad de dolares que quiere convertir a pesos");
            float pesos = scanner.nextFloat();
            float dolares = pesos * PrecioDedolar;
            System.out.println(dolares + " pesos  " );

      }
    }


