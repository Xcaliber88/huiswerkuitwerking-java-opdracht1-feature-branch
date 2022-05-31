import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        Boolean play = true;
        String ongeldig = "ongeldige invoer";


        Scanner userInputScanner = new Scanner(System.in);


        Translator translator = new Translator(numeric, alphabetic);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = userInputScanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                play = false;
            } else if (input.equalsIgnoreCase("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                Integer number = userInputScanner.nextInt();
                userInputScanner.nextLine();
                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println("ongeldige invoer");
                }
            } else {
                System.out.println("ongeldige invoer");
            }

        }
    }
}
