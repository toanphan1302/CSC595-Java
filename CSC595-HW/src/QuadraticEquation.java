public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() > 0) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() > 0) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }
}
