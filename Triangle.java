import java.util.*;
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public boolean isRight() {
        // Check if any two sides squared is equal to the square of the third side
        return (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) ||
                (Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) ||
                (Math.pow(side3, 2) + Math.pow(side1, 2) == Math.pow(side2, 2));
    }

    public boolean isScalene() {
        // Check if no two sides are equal
        return side1 != side2 && side2 != side3 && side3 != side1;
    }

    public boolean isIsosceles() {
        // Check if exactly two sides are equal
        return side1 == side2 || side2 == side3 || side3 == side1;
    }

    public boolean isEquilateral() {
        // Check if all three sides are equal
        return side1 == side2 && side2 == side3;
    }

    public static void main(String[] args) {
        // Create a triangle with side lengths 3, 4, and 5
        Triangle triangle = new Triangle(3, 4, 5);

        // Check triangle properties
        System.out.println("Is Right Triangle? " + triangle.isRight());
        System.out.println("Is Scalene Triangle? " + triangle.isScalene());
        System.out.println("Is Isosceles Triangle? " + triangle.isIsosceles());
        System.out.println("Is Equilateral Triangle? " + triangle.isEquilateral());
    }
}
