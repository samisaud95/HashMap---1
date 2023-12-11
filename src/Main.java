import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//Creare 3 hashmap con 3
// differenti metodi di inizializzazione
// e stampare il contenuto


public class Main {
    public static void main(String[] args) {
        HashMap<String, Character> Vocales = new HashMap<>();
        //  Inizializziamo il primo metodo

        Vocales.put("A", 'A');
        Vocales.put("E", 'E');
        Vocales.put("I", 'I');
        Vocales.put("O", 'O');
        Vocales.put("U", 'U');


        HashMap<String, Integer> Numeros = new HashMap<>();
            //  Inizializziamo il secondo metodo

            Numeros.put("Uno", 1);
            Numeros.put("Due", 2);
            Numeros.put("Tre", 3);
            Numeros.put("Quattro", 4);
            Numeros.put("Cinque", 5);


            HashMap<String, String> Animales = new HashMap<>();
            //  Inizializzamo il terzo metodo
            Animales.put("Cane", "uno");
            Animales.put("Gatto", "Due");
            Animales.put("Leone", "Tre");
            Animales.put("Serpente", "Quatro");
            Animales.put("Formiga", "Cinque");

            // Stampiamo tutti valori dentro del metodo
            System.out.println("Vocales : " + Vocales);

            System.out.println("Numeros : " + Numeros);

            System.out.println("Animales : " + Animales);
        }

    }






