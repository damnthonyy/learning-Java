package conditions;

public class Main {
    public static void main(String[] args) {
        // variables
        int age = 78;

        // conditions
        if (age < 18){
            System.out.println("Accès refusé ❌");
        } else if ( 18 <=age && age < 65 ){
            System.out.println("Accès autorisé ✅");
        }
        else if ( age > 65){
        System.out.println("Accès gratuit \uD83D\uDC74 ");
        }
        else{
            System.out.println("Une erreur est survenue, Veuillez réessayer");
        }
    }
}
