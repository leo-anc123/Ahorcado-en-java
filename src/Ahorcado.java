import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // la clase scanner permite al usuario que escriba
        Scanner scanner = new Scanner(System.in);

        // declaraciones y variables
        String palabraSecreta = "inteligencia";
        int intentosmaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Bucle For
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            // System.out.println(letrasAdivinadas[i]);
        }
        ;
        // Bucle While
        while (!palabraAdivinada && intentos < intentosmaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " "
                    + (palabraSecreta.length() + " letras")); // Esto se usa cuando tenemos una palabra de chars
            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("letra incorrecta! te quedan " + (intentosmaximos - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades! has adivinado la palabra secreta: " + palabraSecreta);
            }
            ;
        }

        if (!palabraAdivinada) {
            System.out.println("Que pena, te has quedado sin intentos");
        }

        scanner.close();
    }
}
