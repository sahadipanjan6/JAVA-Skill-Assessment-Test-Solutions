// Write a Java program to sort a numeric array.

import java.io.*;

public class SortArray
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

        // sorting the array using Bubble Sort algorithm
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i=0; i<myArray.length; i++)
        {
            for(j=0; j<(myArray.length-i-1); j++)
            {
                if(myArray[j] >= myArray[j+1])
                {
                    temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        // displaying the sorted array
        System.out.println("Sorted Array is:- ");
        for(int index=0; index<myArray.length; index++)
            System.out.print(myArray[index] + " ");
    }
}