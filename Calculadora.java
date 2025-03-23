import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora Básica");
        System.out.println("Por favor, selecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = suma(num1, num2);
                break;
            case 2:
                resultado = resta(num1, num2);
                break;
            case 3:
                resultado = multiplicacion(num1, num2);
                break;
            case 4:
                resultado = division(num1, num2);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            System.exit(0);
        }
        return a / b;
    }
}