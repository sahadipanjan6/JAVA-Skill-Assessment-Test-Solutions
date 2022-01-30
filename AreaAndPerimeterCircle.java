/* Write a Java program to print the area and perimeter of a circle. */

import java.util.*;

public class AreaAndPerimeterCircle
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();

        System.out.println("Area of Circle: " + (Math.PI*Math.pow(radius,2)));
        System.out.println("Perimeter of Circle: " + (2*Math.PI*radius));

        sc.close();
    }
}