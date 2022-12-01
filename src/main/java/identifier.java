import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class identifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = s.nextLine();
        System.out.println("You entered: " + "\"" + input + "\"");
        System.out.println(StringUtils.isNumeric(input) + " \"" + input + "\""
        + " is not a number.");
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}
