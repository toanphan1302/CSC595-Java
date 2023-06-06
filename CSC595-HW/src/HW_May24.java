import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class HW_May24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "* * * * * Calculate Grade * * * * *\n(1) calculating the total grade of a course, enter 1\n(2) calculating the average of n courses, enter 2\n(3) find the max grade from n courses, enter 3\n(4) determine the numeric range of a letter grade, etner 4\n(5)determine the letter grade, enter 5\n(6) exit, enter -1");
            var userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5) {
                System.out.println("You have selected opttion " + userInput);
                continue;
            } else if (userInput == -1) {
                System.out.println("Bye Bye");
                break;
            } else {
                System.out.println("wrong option, try again");
                continue;
            }
        }

    }
}
