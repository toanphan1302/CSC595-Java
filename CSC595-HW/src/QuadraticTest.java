import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for a quadratic equation");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        var quadratic = new QuadraticEquation(a, b, c);
        double discriminant = quadratic.getDiscriminant();
        if (discriminant > 0) {
            System.out.print("The equation has two roots:\t" + quadratic.getRoot1() + "\t" + quadratic.getRoot2());

        } else if (discriminant < 0) {
            System.out.print("The equation has no root");
        } else {
            System.out.print("The equation has one root:\t" + quadratic.getRoot1());
        }

    }
}
