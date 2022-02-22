package root;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("mRNA: ");
            String d = scanner.next();

            toActivity(d);
        }

    }


    public static void toActivity (String mRNA) {



        if (!mRNA.contains(" ")) mRNA = mRNA.replaceAll(" ", "");

            int t = mRNA.length();

            char[] c = mRNA.toCharArray();

            for (int i = 0; i < t; i = i + 3) {

                System.out.println(toMessage("" + c[i] + c[i + 1] + c[i + 2]));



            }





    }



    public static Character toMessage (String mRNA) {
        char letter;

        switch (mRNA.toUpperCase()) {
            case "UUU", "UUC" -> letter = 'A';
            case "UUA", "UUG" -> letter = 'B';
            case "CUU", "CUC", "CUA", "CUG" -> letter = 'C';
            case "AUU", "AUC", "AUA" -> letter = 'D';
            case "AUG" -> letter = '+';
            case "GUU", "GUC" -> letter = 'E';
            case "GUA", "GUG" -> letter = 'F';
            case "UCU", "UCC", "UCA", "UCG" -> letter = 'G';
            case "CCU", "CCC", "CCA", "CCG" -> letter = 'H';
            case "ACU", "ACC", "ACA", "ACG" -> letter = 'I';
            case "GCU", "GCC", "GCA", "GCG" -> letter = 'J';
            case "UAU", "UAC" -> letter = 'K';
            case "UAA", "UAG" -> letter = '_';
            case "CAU", "CAC" -> letter = 'L';
            case "CAA", "CAG" -> letter = 'M';
            case "AAU", "AAC" -> letter = 'N';
            case "AAA", "AAG" -> letter = 'O';
            case "GAU", "GAC" -> letter = 'P';
            case "GAA", "GAG" -> letter = 'Q';
            case "UGU", "UGC" -> letter = 'R';
            case "UGA" -> letter = '_';
            case "UGG" -> letter = 'S';
            case "CGU", "CGC", "CGA", "CGG" -> letter = 'T';
            case "AGU", "AGC" -> letter = 'U';
            case "AGA", "AGG" -> letter = 'V';
            case "GGU", "GGC" -> letter = 'W';
            case "GGA", "GGG" -> letter = 'Y';
            default -> throw new IllegalStateException("git gud");
        }


        return letter;
    }


    public static @Deprecated(since = "Not supported YET") String d2mr (String DNA) {
        String mRNA;

        switch (DNA) {
            case "T" -> mRNA = "A";
            case "A" -> mRNA = "U";
            case "C" -> mRNA = "G";
            case "G" -> mRNA = "C";
            default -> throw new IllegalStateException("oops");
        }

        return mRNA;

    }


}
