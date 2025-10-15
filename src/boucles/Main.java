package boucles;

public class Main {
    public static void main(String[] args) {

        // For
/*        for ( int i =0; i < 5; i++ ){
            System.out.println("Hello");
        }*/

        // while ( quand on connait pas combien de fois ca va tourner )
/*        int i = 0;
        while (i < 5){
            System.out.println("Tour n " + i);
            i++; // ne pas oublier sinon boules infinie
        }*/

        // while ( on definis le nombre de tour nous meme )
/*        int i =0;
        do {
            System.out.println("i = " + i);
            i++;
        }
        while( i<10 );*/

/*        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }*/

        // avec do while

/*        int i = 0;

        do {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= 20);*/

        // while
        int i = 0;
        while (i <=20){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;

        }


    }
}
