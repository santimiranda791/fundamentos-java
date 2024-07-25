import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Main.primero();
                    break;
                case 2:
                    Main.segundo();
                    break;
                case 3:
                    Main.tercero();
                    break;
                case 4:
                    Main.cuarto();
                    break;
                case 5:
                    Main.quinto();
                    break;
                case 6:
                    Main.sexto();
                    break;
                case 7:
                    Main.septimo();
                    break;
                case 8:
                    Main.octavo();
                    break;
                case 9:
                    Main.noveno();
                    break;
                case 10:
                    Main.decimo();
                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 11);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Salir del programa");
        System.out.println("--------------------------");
    }

    }

