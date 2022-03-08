import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class dependency {
    public static void main(String[] args) {  Scanner input = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = input.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("You have entered numbers: %s" + StringUtils.isNumeric(userInput));
        } else {
            System.out.printf("You have entered: %s", userInput);
            System.out.println();
            System.out.printf("The flip case of what you entered is: %s", StringUtils.swapCase(userInput));
            System.out.println();
            System.out.printf("The reverse of what you entered is: %s", StringUtils.reverse(userInput));
        }
    }
}

