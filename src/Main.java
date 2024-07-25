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

    }
}
