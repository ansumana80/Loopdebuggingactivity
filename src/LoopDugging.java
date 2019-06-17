import java.util.Scanner;

public class LoopDugging {

    public static void main(String[] args) {
        String userInput = "";

        Scanner keyboard = new Scanner(System.in);

        while (!userInput.equals("stop"))
        {
            System.out.println("Input a word, I will repeat it to you. Once you are ready to stop, type stop: ");
            userInput = keyboard.next();
            System.out.println(userInput);
        }

    }
}