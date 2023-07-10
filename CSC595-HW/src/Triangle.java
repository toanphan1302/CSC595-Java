import java.util.Scanner;

class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color
     * and filled value
     */
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * its get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}

public class Triangle extends SimpleGeometricObject {
    // Three double data fields named side1, side2, and side3 with default values
    // 1.0 to denote three sides of the triangle.
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    // A no-arg constructor that creates a default triangle.
    public Triangle() {
        side1 = 3.0;
        side2 = 4.0;
        side3 = 5.0;
    }

    // A constructor that creates a triangle with the specified side1, side2, and
    // side3.
    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // The accessor methods for all three data fields.
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // A method named getArea() that returns the area of this triangle.
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        var test = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    // toString method
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args) {
        double s1 = -1.0;
        double s2 = -1.0;
        double s3 = -1.0;
        String color = "";
        Boolean filled = false;
        int flag = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1");
        s1 = sc.nextDouble();
        System.out.println("enter side 2");
        s2 = sc.nextDouble();
        System.out.println("enter side 3");
        s3 = sc.nextDouble();
        System.out.println("enter color");
        color = sc.next();
        System.out.println("Will the triangle filled? enter 1 (true) or 0 (false)");
        flag = sc.nextInt();
        if (flag == 1) {
            filled = true;
        } else if (flag == 0) {
            filled = false;
        }
        Triangle triangle = new Triangle(s1, s2, s3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("color = " + triangle.getColor());
        System.out.println("filled? = " + triangle.isFilled());
    }
}
