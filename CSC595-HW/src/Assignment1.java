import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // BODY MASS INDEX CALCULATOR
        Scanner scanner = new Scanner(System.in);
        double weight = -1.0;
        double height = -1.0;
        while (weight <= 0 || height <= 0) {
            System.out.println("Enter weight in pounds:");
            weight = scanner.nextDouble();
            System.out.println("Enter height in inches:");
            height = scanner.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Height and weight cannot be negative or 0.\nPlease try again.");
            }
        }
        double bmi = weight * 703 / (height * height);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }

        // QUESTION 2
        // Ask the user to input a string representing an integer.
        System.out.println("Please enter an integer");
        String input = scanner.next();
        try {
            // Convert the string into the integer
            int number = Integer.parseInt(input);
        } catch (Exception ex) {
            System.out.println("Input is not an integer");
        }
        // Apply a for loop to create the table
        System.out.println("number\tsquare\tcube");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "\t" + i * i + "\t" + i * i * i);
        }
        // Apply while loop to create the table
        System.out.println("number\tsquare\tcube");
        int i = 0;
        while (i <= 10) {
            System.out.println(i + "\t" + i * i + "\t" + i * i * i);
            i++;
        }

        // QUESTION 3
        // defines two variables( named mradius and marea)
        double mradius = 1.0;
        double marea = -1.0;
        // calls the function and passes the value of mradius to the function
        marea = CalculateArea(mradius);
        System.out.println("Area = " + marea);
        // QUESTION 4
        int numberOfSides = -1;
        double side = -1.0;
        while (numberOfSides <= 0 || side <= 0) {
            System.out.print("Enter number of sides:");
            numberOfSides = scanner.nextInt();
            System.out.print("Enter the side:");
            side = scanner.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Number of sides and side cannot be negative or 0.\nPlease try again.");
            }
        }
        var polygonArea = area(numberOfSides, side);
        System.out.println("The area of the polygon is " + polygonArea);
    }

    public static double area(int n, double side) {
        var area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return area;
    }

    public static double CalculateArea(double radius) {
        double localRadius;
        double area;
        localRadius = radius;
        area = 3.1415926 * localRadius * localRadius;
        return area;
    }
}
