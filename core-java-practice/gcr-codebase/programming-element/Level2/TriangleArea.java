package programmingElements;

import java.util.Scanner;

class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base;
        double height;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;

        double areaInSqInch = areaInSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaInSqInch
                + " and sq cm is "
                + areaInSqCm);

        input.close();
    }
}
