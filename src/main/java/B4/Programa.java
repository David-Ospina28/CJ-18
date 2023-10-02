package B4;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Programa {
    private static final Logger logger = Logger.getLogger(Programa.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.setLevel(Level.INFO);

        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            int num1, num2, res;

            do {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextInt();

                try {
                     res = multiplicar(num1, num2);
                    logger.log(Level.INFO, "El resultado de la multiplicación es : " + res);

                    if (res <= 100) {
                        logger.log(Level.INFO, "La multiplicación no logro sobrepasar los 100, Ingresa de nuevo los números nuevamente.");
                    }
                } catch (ArithmeticException e) {
                    logger.log(Level.SEVERE, "Error: No se debe dividir por cero", e);
                    res = 0;
                }
            } while (res <= 100);

            System.out.println("La multiplicación es mayor que 100. El programa ha sido finalizado correctamente.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Hay un error en el programa!!!", e);
        } finally {
            scanner.close();
        }
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se debe dividir por cero");
        }
        return a * b;
    }
}


