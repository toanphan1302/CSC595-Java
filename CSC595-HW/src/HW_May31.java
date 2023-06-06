import java.util.Scanner;

public class HW_May31 {
    public static void main(String[] args) throws Exception {
        Question1();
        Question2();
    }

    public static void Question1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Saint Martin's Universiy email address:");
        var email = scanner.nextLine();
        int index = -1;
        var errorMessage = "";
        Boolean hasError = false;
        index = email.indexOf('@');
        if (index > 0) {
            var hostName = email.substring(index + 1, email.length());
            if (hostName.equalsIgnoreCase("stmartin.edu")) {
                var userName = email.substring(0, index);
                System.out.println("Hello " + userName);
            } else {
                errorMessage += "Host name must be \"stmartin.edu\"\n";
                hasError = true;
            }
        } else {
            errorMessage += "Missing user name or \'@\' simple \n";
            hasError = true;
        }
        if (hasError == true) {
            System.out.println(errorMessage);
        }
    }

    public static void Question2() {
        double[] maryGrade = { 83, 0, 4.7, 100, 100, 100, 100, 76, 20 };
        var maryTotal = maryGrade[0] * 0.35
                + maryGrade[1] + maryGrade[2] + (maryGrade[3] + maryGrade[4] + maryGrade[5] + maryGrade[6]) * 0.05
                + maryGrade[7] * 0.15 + maryGrade[8];
        System.out.println("Caroline May Mary Crompton = " + maryTotal);
        double[] classTotal = { 85.15, 87.9, 90.4, 92.7, 92.85, 40.1, 88.8, 32.25, 80.7, 91.1, 86.35, 94.25,
                94.35, 78.1, 96.3, 84.3, 88.25 };
        var max = -1.0;
        var min = Double.MAX_VALUE;
        double total = 0;
        for (var i : classTotal) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            total += i;
        }
        var ave = total / classTotal.length;
        System.out.println("max = " + max + " min = " + min + " ave = " + ave);

    }
}
