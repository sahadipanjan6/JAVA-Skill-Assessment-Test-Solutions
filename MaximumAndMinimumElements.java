// Write a Java program to find the maximum and minimum value of an array.

import java.io.*;

public class MaximumAndMinimumElements
{
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of elements: ");
        int N = Integer.parseInt(br.readLine());

        int myArray[] = new int[N];
        System.out.println("Enter " + N + " elements...");
        for(int i=0; i<N; i++)
            myArray[i] = Integer.parseInt(br.readLine());

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int index=0; index<myArray.length; index++)
        {
            if(myArray[index] >= maximum)
                maximum = myArray[index];
            
            else if(myArray[index] <= minimum)
                minimum = myArray[index];
        }

        System.out.println("Minimum Element = " + minimum);
        System.out.println("Maximum Element = " + maximum);
    }
}