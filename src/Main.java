import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Miltiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion que desea utilizar: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Suma(scanner);
                    break;
                case 2:
                    Resta(scanner);
                    break;
                case 3:
                    Multi(scanner);
                    break;
                case 4:
                    Division(scanner);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void Suma(Scanner scanner) {
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Respuesta:  " + result);
    }

    public static void Resta(Scanner scanner) {
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Respuesta:  " + result);
    }

    public static void Multi(Scanner scanner) {
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Respuesta: " + result);
    }

    public static void Division(Scanner scanner) {
        System.out.print("Ingresa el dividiendo: ");
        double dividend = scanner.nextDouble();
        System.out.print("Ingresa el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error. Division de 0");
        } else {
            double result = dividend / divisor;
            System.out.println("Respuesta: " + result);
        }
    }
}