// Write a JAVA program to find out the roots of a quadratic equation whose 
// coefficients are given by the user.

import java.util.*;

public class FindRoots
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Coefficient-A: ");
        int A = sc.nextInt();
        System.out.println("Enter value of Coefficient-B: ");
        int B = sc.nextInt();
        System.out.println("Enter value of Coefficient-C: ");
        int C = sc.nextInt();

        int discriminant = (int)Math.sqrt(Math.pow(B,2) - 4*A*C);

        // taking decisions based on the discriminant value
        if(discriminant == 0)
            System.out.println("Root = " + (-B/(2*A)));

        else if(discriminant < 0)
            System.out.println("Roots are imaginary");

        else
        {
            float root1 = (-B + discriminant) / (2*A);
            float root2 = (-B - discriminant) / (2*A);
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }

        sc.close();
    }
}