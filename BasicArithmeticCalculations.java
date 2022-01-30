/* Write a JAVA program to accept two integers from the user and display the result of
their addition, subtraction, multiplication, division and modulus with their appropriate messages. */

import java.util.*;

public class BasicArithmeticCalculations
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = sc.nextInt();

        // performing arithmetic operations
        System.out.println("Adding "+num1+" and "+num2+" = "+ (num1+num2));
        System.out.println("Subtracting "+num2+" from "+num1+" = "+ (num1-num2));
        System.out.println("Multiplying "+num1+" and "+num2+ " = "+ (num1*num2));

        if(num2 == 0)
            System.out.println("Division by Zero is not possible !!!");
        
        else
            System.out.println("Dividing "+num1+" by "+num2+ " = " + (num1/num2));

        sc.close();
    }
}