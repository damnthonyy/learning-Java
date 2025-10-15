package variables;

public class Main {
    public static void main( String [] args) {
        // variables
        String name = "Antoine";
        int age = 23;
        String city = "Paris";

        // log
        System.out.println(" Bonjour, je m'appelle " + name + " j'ai " + age + " ans et j'habite à " + city + "." );

    }
}

// j'aurai pu l'écire comme ca mais à revoir pour mieux comprendre la syntaxe
// System.out.printf("Bonjour, je m'appelle %s, j'ai %d ans et j'habite à %s.%n", name, age, city);
