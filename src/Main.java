import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Integer[] numeric= {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht" , "negen", "nul"};
        Boolean play=true;
        String ongeldig = "ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        Translator translatorApp = new Translator(numeric,alphabetic);
    }
}
