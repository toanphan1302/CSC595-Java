import java.util.Scanner;

public class HW_May17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        var radius = scanner.nextDouble();
        System.out.println("Enter value of PI");
        var pi = scanner.nextDouble();
        System.out.println("Area of the circle = " + pi * radius * radius);

        System.out.println("Enter semi-major axis value");
        var majorAxis = scanner.nextDouble();
        System.out.println("Enter semi-minor axis value");
        var minorAxis = scanner.nextDouble();
        var ovalArea = pi * (majorAxis / 2) * (minorAxis / 2);
        System.out.println("Area of the oval = " + ovalArea);

    }
}