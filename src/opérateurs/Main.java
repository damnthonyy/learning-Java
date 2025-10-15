package opérateur;

public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        // Calculs de base
        System.out.println("Addition : " + (a + b));
        System.out.println("Soustraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division entière : " + (a / b));
        System.out.println("Modulo : " + (a % b));

        // Comparaisons
        System.out.println("a > b ? " + (a > b));
        System.out.println("a == b ? " + (a == b));
        System.out.println("a != b ? " + (a != b));

        // Affectations composées
        a += 2;
        System.out.println("a après a += 2 → " + a);
    }
}
