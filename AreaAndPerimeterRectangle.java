/* Write a Java program to print the area and perimeter of a rectangle. */

import java.util.*;

public class AreaAndPerimeterRectangle
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Area of rectangle: " + (length*breadth));
        System.out.println("Perimeter of rectangle: " + (2*(length+breadth)));
        sc.close();
    }
}