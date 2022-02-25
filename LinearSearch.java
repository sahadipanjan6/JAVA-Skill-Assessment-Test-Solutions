// Write a Java program to test if an array contains a specific value.
// Using LINEAR-SEARCH algorithm.

import java.io.*;

public class LinearSearch
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

        System.out.println("Enter element to be searched: ");
        int key = Integer.parseInt(br.readLine());
        int flag = 0;

        for(int index=0; index<myArray.length; index++)
        {
            if(myArray[index] == key)
            {
                flag = 1;
                System.out.println("Found in index number " + index);
                break;
            }
        }

        if(flag == 0)
            System.out.println(key + " cannot be found in the given array...");
    }
}