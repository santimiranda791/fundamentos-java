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
                    Main.once();
                    break;
                case 12:
                    Main.doce();
                    break;
                case 13:
                    Main.trece();
                    break;
                case 14:
                    Main.catorce();
                    break;
                case 15:
                    Main.quince();
                    break;
                case 16:
                    Main.dieciseis();
                    break;
                case 17:
                    Main.diecisiete();
                    break;
                case 18:
                    Main.dieciocho();
                    break;
                case 19:
                    Main.diecinueve();
                    break;
                case 20:
                    Main.veinte();
                    break;
                case 21:
                    Main.veintiuno();
                    break;
                case 22:
                    Main.ventidos();
                    break;
                case 23:
                    Main.ventitres();
                    break;
                case 24:
                    Main.venticuatro();
                    break;
                case 25:
                    Main.venticinco();
                    break;
                case 26:
                    Main.ventiseis();
                    break;
                case 27:
                    Main.ventisiete();
                    break;
                case 28:
                    Main.ventiocho();
                    break;
                case 29:
                    Main.ventinueve();
                    break;
                case 30:
                    Main.treinta();
                    break;
                case 31:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 31);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. ¿Cuál será el resultado de la siguiente operación?\n" + "int x = (int) 5.89 + (int) 3.45;\n" + "System.out.println(x);\n");
        System.out.println("2. Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?\n");
        System.out.println("3. ¿Qué valor se imprimirá?\n" + "double d = 100.04;\n" + "long l = (long)d;\n" + "int i = (int)l;\n" + "System.out.println(i);\n");
        System.out.println("4. Escribe código para convertir un String que contiene un número a un int.\n");
        System.out.println("5. ¿Cuál es el resultado de (int) (char) (byte) -1?\n");
        System.out.println("6. Convierte el número 65 a un char. ¿Qué carácter obtienes?\n");
        System.out.println("7. ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?\n");
        System.out.println("8. Escribe código para convertir un float a un String.\n");
        System.out.println("9. ¿Cuál es el resultado de (int) Math.round(3.7)?\n");
        System.out.println("10. Dado byte b = 50;, ¿cómo lo convertirías a short?\n");
        System.out.println("11. ¿Cuál es el valor de x después de la siguiente operación?\n" + "int x = 10; x += 5;\n");
        System.out.println("12. Simplifica la siguiente expresión usando un operador de asignación compuesta:\n" + "y = y * (x + 5);\n");
        System.out.println("13. ¿Cuál es el valor de a después de estas operaciones?\n" + "int a = 15; a %= 4;\n");
        System.out.println("14. Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.\n");
        System.out.println("15. ¿Qué hace la siguiente operación? x ^= 2;\n");
        System.out.println("16. ¿Cuál es el valor de x e y después de estas operaciones?\n" + "int x = 5; int y = ++x;\n");
        System.out.println("17. ¿Qué se imprimirá en la consola?\n" + "int a = 5; System.out.println(a++); System.out.println(a);\n");
        System.out.println("18. Escribe código que use el operador de decremento para disminuir una variable count en 1.\n");
        System.out.println("19. ¿Cuál es la diferencia entre ++i y i++?\n");
        System.out.println("20. ¿Qué valor tendrá x después de esta operación?\n" + "int x = 3; x = x++;\n");
        System.out.println("21. ¿Cuál es el resultado de la siguiente expresión?\n" + "int i = 5;\n" + "i += ++i + i++ + ++i;\n");
        System.out.println("22. Escribe código para convertir un double a un int, y luego incrementa el resultado en 1 usando el operador de postincremento.\n");
        System.out.println("23. ¿Qué se imprimirá en la consola?\n" + "double d = 5.7; \n" + "int i = (int)d; \n" + "i *= 2; \n" + "System.out.println(i--);\n");
        System.out.println("24. Crea una expresión que use casteo y un operador de asignación compuesta para dividir un int por 2.0 y asignar el resultado a una variable double.\n");
        System.out.println("25. ¿Cuál es el resultado de la siguiente operación?\n" + "char c = 'X'; \n" + "c += 32; \n" + "System.out.println(c);\n");
        System.out.println("26. Escribe código para convertir un long a un short, y luego usa un operador de asignación compuesta para multiplicarlo por 3.\n");
        System.out.println("27. ¿Qué valor tendrá x después de estas operaciones?\n" + "int x = 10; \n" + "x += (x++) + (++x);\n");
        System.out.println("28. Crea una expresión que use casteo para convertir un float a un byte, y luego usa el operador de predecremento.\n");
        System.out.println("29. ¿Cuál es el resultado de la siguiente operación?\n" + "int i = 257; \n" + "byte b = (byte)i; \n" + "System.out.println(b);\n");
        System.out.println("30. Escribe una expresión que combine casteo, un operador de asignación compuesta y un operador de incremento para convertir un double a un int, sumarle 5 y luego incrementarlo en 1.\n2");
        System.out.println("31. Salir del programa");
        System.out.println("--------------------------");
    }
    }

