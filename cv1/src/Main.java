import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "Windows-1250");

        while (true) {

            System.out.print("Vyberte úlohu:\n1 → úloha č. 1 (trojúhelník)\n2 → Úloha č. 2 (věta pozpátku)\n3 → Úloha č. 3 (počet slov)\n4 → Ukončit program\nMožnost: ");

            int identifier;

            try {

                identifier = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {

                System.out.println("\nNe fakt chci číslo ne to co si mi napsal\n");

                continue;
            }

            switch (identifier) {

                case 1:
                    assignment1();
                    break;
                case 2:
                    assignment2();
                    break;
                case 3:
                    assignment3();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\nNeznámá možnost!\n");

            }
        }
    }

    public static void assignment1() {

        System.out.println("-- // ASSIGNMENT 1 \\\\ --");

        Scanner scanner = new Scanner(System.in, "Windows-1250");

        int height;

        while (true) {

            System.out.print("Výška trojúhelníku: ");

            try {

                height = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {

                System.out.println("Kamo ti jsy negramotní? výška asy musí bít čýslo");

                continue;
            }

            if (height < 2) { System.out.println("Výška musí být větší jak 1"); continue; }

            break;
        }


        int accumulator = 1;
        int increment = 1;

        for (int i = 0; i < 2*height - 1; i++) {

            for (int j = 0; j < accumulator; j++) System.out.print("*");

            increment -= 2*Math.floorDiv(accumulator, height);

            accumulator += increment;

            System.out.println();

        }

        System.out.println("-- // END OF ASSIGNMENT 1 \\\\ --");
    }

    public static void assignment2() {

        System.out.println("-- // ASSIGNMENT 2 \\\\ --");

        System.out.print("Zadejte větu: ");

        Scanner scanner = new Scanner(System.in, "Windows-1250");

        String sentence = scanner.nextLine();

        System.out.print("Pozpátku: ");

        for (int i = sentence.length() - 1; i >= 0; i--) System.out.print(sentence.charAt(i));

        System.out.println();

        System.out.println("-- // END OF ASSIGNMENT 2 \\\\ --");
    }

    public static void assignment3() {

        System.out.println("-- // ASSIGNMENT 3 \\\\ --");

        System.out.print("Zadejte větu: ");

        Scanner scanner = new Scanner(System.in, "Windows-1250");

        String sentence = scanner.nextLine();

        Pattern pattern = Pattern.compile("[^ ]+");
        Matcher matcher = pattern.matcher(sentence);

        int accumulator = 0;

        while (matcher.find()) accumulator++;

        System.out.print("Počet slov: ");

        System.out.println(accumulator);

        System.out.println("-- // END OF ASSIGNMENT 3 \\\\ --");
    }
}
