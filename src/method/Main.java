package method;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println( i + " est " + isPair(i));
            i++;

        }while(i<=10);
    }

    public static boolean isPair ( int nombre) {
        if(nombre % 2 == 0) // on aurait pu faire return nombre % 2 == 0 cça renvois deja un boolean
            return true;
        else
            return false;
    }

}
