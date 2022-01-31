// Write a JAVA program to convert a given binary number to a decimal number.

import java.util.*;

public class Binary2Decimal {
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number: ");
        String b_num = sc.nextLine();
        int d_num = 0;
        
        for(int i=b_num.length()-1, index=0; i>=0; i--,index++)
        {
            int digit = Character.getNumericValue(b_num.charAt(i));
            d_num += digit * Math.pow(2, index);
        }
        System.out.println("Decimal Number: " + d_num);
        sc.close();
     }
}
