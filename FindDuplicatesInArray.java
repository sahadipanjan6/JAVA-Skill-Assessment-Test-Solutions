// Write a Java program to find the duplicate values of an array of integer values.

import java.io.*;

public class FindDuplicatesInArray
{
    public static int isPresent(int arr[], int element)
    {
        int output = 0;

        for(int index=0; index<arr.length; index++)
        {
            if(arr[index] == element)
            {
                output = 1;
                break;
            }
        }
        return output;
    }

    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of elements: ");
        int N = Integer.parseInt(br.readLine());

        int myArray[] = new int[N];
        System.out.println("Enter " + N + " elements...");
        for(int i=0; i<N; i++)
            myArray[i] = Integer.parseInt(br.readLine());
        
        int unique[] = new int[N];
        int u_idx = 0;

        // building the unique array
        for(int i=0; i<myArray.length; i++)
        {
            if(isPresent(unique, myArray[i]) == 0)
                unique[u_idx++] = myArray[i];
        }

        // finding the duplicate elements
        System.out.println("Duplicate Elements are:- ");
        for(int element : unique)
        {
            int count = 0;
            for(int j=0; j<myArray.length; j++)
            {
                if(element == myArray[j])
                    count++;
            }

            if(count > 1)
                System.out.print(element + " ");
        }
    }
}