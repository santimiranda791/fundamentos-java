public class Main {
    public static void primero(){
        double x = (double )5.89 + (double) 3.45;
        System.out.println(x);
    }
    public static void segundo(){
        char c = 'A';
        int asciiValue = (int) c;  // Convertir el carácter a su valor ASCII
        System.out.println("El valor ASCII de " + c + " es " + asciiValue);
    }
    public static void tercero(){
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);
    }
    public static void cuarto(){
        String numeroComoString = "12345";
        int numeroComoInt = Integer.parseInt(numeroComoString);
        System.out.println("El número como int es: " + numeroComoInt);
    }
    public static void quinto(){
        byte b = (byte) -1;

        char c = (char) b;

        int resultado = (int) c;

        System.out.println("El resultado es: " + resultado);
    }
    public static void sexto(){
        char caracter = (char) 65;

        System.out.println("El caracter obtenido es: " + caracter);
    }
    public static void septimo(){
        long numeroLong = 1234567890L;
        int numeroInt = (int) numeroLong;

        System.out.println("Valor long: " + numeroLong);
        System.out.println("Valor int (con cast): " + numeroInt);
    }
    public static void octavo(){
        float numeroFloat = 3.14159f;
        String resultado = String.valueOf(numeroFloat);

        System.out.println("El numero float convertido a String es: " + resultado);
    }
    public static void noveno(){
        int resultado = (int) Math.round(3.7);

        System.out.println("El resultado es: " + resultado);
    }
    public static void decimo(){
        byte b = 50;
        short shortchange = (short) b;
        System.out.println("El resultado es: " + shortchange);
    }
    public static void once(){
        int x = 10; x += 5;
        System.out.println("El resultado es: " +x);
    }
    public static void doce(){
        int y = 10;
        int x = 3;
        y *= (x + 5);
        System.out.println("El valor de y es: " + y);
    }
    public static void trece(){
        int a = 15; a %= 4;
        System.out.println("El resultado es: " +a);
    }
    public static void catorce(){
        int x = 15;
        int y = 3;
        x+=y;
        System.out.println("El resultado es: " +x);
    }
    public static void quince(){
        int x=20;
        x ^= 2;
        System.out.println("El resultado es: " +x);
    }public static void dieciseis(){
        int x = 5;
        int y = ++x;
        System.out.println("El resultado es: " +y);
    }public static void diecisiete(){
        int a = 5;
        System.out.println(a++); System.out.println(a);
    }public static void dieciocho(){
    int count = 1;
        System.out.println(count--);
    }public static void diecinueve(){
        int x =4;
        x = ++x;
        int y =4;
        y = y++;
        System.out.println(x);
        System.out.println(y);
    }public static void veinte(){
        int x = 3; x = x++;
        System.out.println("El resultado es: " +x);
    }public static void veintiuno(){
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println("El resultado es: " +i);
    }public static void ventidos(){
        double x = 10.75;
        int y = (int) x;
        y++;
        System.out.println(y);
    }public static void ventitres(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
    }public static void venticuatro(){
        int x = 10;
        double y = 0.0;
        y += (double) x / 2.0;
        System.out.println("Resultado de la división: " + y);
    }public static void venticinco(){
        char c = 'X';
        c += 32;
        System.out.println(c);
    }public static void ventiseis(){
        long longValor = 12345L;

        short shortValor = (short) longValor;

        shortValor *= 3;

        System.out.println("Resultado después de multiplicar por 3: " + shortValor);
    }public static void ventisiete(){
        int x = 10;
        x += (x++) + (++x);
        System.out.println("El resultado es: " +x);
    }public static void ventiocho(){
        float valorFloat = 10.75f;
        byte valorByte = (byte) valorFloat;
        --valorByte;
        System.out.println("Valor después de predecremento: " + valorByte);
    }public static void ventinueve(){
        int i = 257;
        byte b = (byte)i;
        System.out.println(b);
    }public static void treinta(){
        double i = 10.0;
        int b = (int)i;
        b += 5 +5;
        System.out.println(++b);

    }
    }


