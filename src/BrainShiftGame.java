import java.util.Random;
import java.util.Scanner;

public class BrainShiftGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String randomCombo = displayCombo();
            if (isNumber() == false) {
                System.out.println("Is the letter a vowel?");
                String userAnswerForVowel = scanner.nextLine();
                //userAnswerForVowel.toLowerCase();
                verifyLetterVowel(randomCombo, userAnswerForVowel.toLowerCase());

            } else if
            (isNumber() == true) {
                System.out.println("Is the number even?");
                String userAnswerForNum = scanner.nextLine();
                //userAnswerForNum.toLowerCase();
                verifyNbrEven(randomCombo, userAnswerForNum.toLowerCase());

            }
            //String userAnswer = scanner.nextLine();
            System.out.println("press exit to leave");
            String exit = scanner.nextLine();
           // exit.toLowerCase();
            if (exit.toLowerCase().equals("exit")){
                break;
            }
        }
	// write your code here


        //boolean a = isNumber();
    }

    public static String displayCombo() {
        // Display a combination of a letter and a number
        String randomCombo=null;
        String alphas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        Random r = new Random();
        int a = 0;
        a = r.nextInt(alphas.length()-1);

        System.out.println(a);
        randomCombo = alphas.substring(a,a+1);
        int n = r.nextInt(9);
        randomCombo = randomCombo+n;
        System.out.println(randomCombo);
        return randomCombo;
    }
    public static Boolean isNumber () {
        // In a random order ask if the number is even and/or if the letter is a vowel

        Random r = new Random();
        int q = r.nextInt(2);
        System.out.println(q);
        if (q==1) {
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
    }
    public static String verifyLetterVowel (String randomCombo, String userInput) {
        // if the letter is a vowel, and user selects 'yes' return true, otherwise return false
        String vowels = "AEIOU";
        String correct = "Incorrect";
        String letter = randomCombo.substring(0);
        if ((vowels.contains(letter)) && (userInput.equals("y"))) {
            correct = "Correct";
        } else if ((!vowels.contains(letter)) && (userInput.equals("n"))){
            correct = "Correct";
        }
        System.out.println("Random combo " + randomCombo+" Result is "+correct);
        System.out.println("User Input " + userInput);
    return "t";
    }
    public static String verifyNbrEven (String randomCombo, String userInput) {
        // if the number is even, and user selects 'yes' return true, otherwise return false
        System.out.println("Random combo " + randomCombo);
        System.out.println("User Input " + userInput);
        // String vowel = "Is the letter a vowel?";
        return "t";
    }
    public static String displayResult () {
        // display result, YAY or BOO
        String result=null;

        return result;

    }
}
