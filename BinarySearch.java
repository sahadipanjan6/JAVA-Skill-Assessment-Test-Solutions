// Write a Java program to test if an array contains a specific value.
// Using BINARY-SEARCH algorithm.

import java.io.*;

public class BinarySearch
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
        int lb = 0;
        int ub = myArray.length - 1;

        // sorting the array
        int temp = 0;
        for(int i=0; i<myArray.length; i++)
        {
            for(int j=0; j<(myArray.length-i-1); j++)
            {
                if(myArray[j] >= myArray[j+1])
                {
                    temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        // binary search algorithm
        while(lb <= ub)
        {
            int mid = lb + (ub - lb)/2;

            if(key == myArray[mid])
            {
                System.out.println("Found in Index Number " + mid);
                flag = 1;
                break;
            }
                
            else if(key < myArray[mid])
                ub = mid - 1;

            else if(key > myArray[mid])
                lb = mid + 1;
        }

        if(flag == 0)
            System.out.println(key + " cannot be found in the given array ...");
    }
}