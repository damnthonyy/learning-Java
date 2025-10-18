package tableau;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] notes = {12, 8, 15, 10, 18};

        float average = moyenne(notes);
        System.out.println(average);
    }

    // afficher toutes les notes
    public static void displayNote(int[] notes) {
        for (int note : notes) {
            System.out.println(note);
        }
    }


    // determiner la sommes des notes
    public static float sum ( int [] notes ) {
        float somme = 0;
        for (int note:notes) {
            somme += note;
        }
        return somme;
    }


    // calculer la moyenne de l'étudiant
    public static float moyenne (int[] notes) {
        float somme = sum(notes);
        return somme/notes.length;
    }



}
