import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class UserString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nWrite a short sentence: ");
        String userInput = input.nextLine();
        System.out.println("You entered: \"" + userInput + "\"");
        if (!isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\"" + " is not a number");
        }
        System.out.println("Flipped Case: " + swapCase(userInput));
        System.out.println("Reversed: " + reverse(userInput));
    }

}
