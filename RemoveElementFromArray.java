// Write a Java program to remove a specific element from an array.

import java.io.*;

public class RemoveElementFromArray
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

        System.out.println("Enter element to be removed: ");
        int key = Integer.parseInt(br.readLine());

        if(isPresent(myArray, key) == 0)
            System.out.println(key + " is not present in the given array...");

        else
        {
            int output[] = new int[N];
            int o_idx = 0;

            for(int i=0; i<myArray.length; i++)
            {
                if(myArray[i] != key)
                    output[o_idx++] = myArray[i];
            }

            System.out.println("Output Array:- ");
            for(int i=0; i<o_idx; i++)
                System.out.print(output[i] + " ");
        }
    }
}