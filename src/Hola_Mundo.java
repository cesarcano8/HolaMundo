import java.util.Scanner;

public class Hola_Mundo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escribe una palabra:");
            String palabra = sc.nextLine();

            System.out.println("La palabra que has escrito es: " + palabra);
            System.out.println("Tu palabra tiene " + palabra.length() + " letras.");
        }
    }
}