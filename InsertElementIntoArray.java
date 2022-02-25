// Write a Java program to insert an element (specific position) into an array.

import java.io.*;

public class InsertElementIntoArray
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

        System.out.println("Enter element to be inserted: ");
        int key = Integer.parseInt(br.readLine());
        System.out.println("Enter position in which to be inserted: ");
        int pos = Integer.parseInt(br.readLine());
        int output[] = new int[N+1];
        int o_idx = 0;
        int breakPoint = 0;
        
        for(int i=0; i<myArray.length; i++)
        {
            if(i != pos)
                output[o_idx++] = myArray[i];

            else
            {
                breakPoint = i;
                break;
            }
        }

        output[o_idx] = key;
        for(int j=breakPoint; j<myArray.length; j++)
            output[++o_idx] = myArray[j];
        
        System.out.println("Output Array:- ");
        for(int a=0; a<output.length; a++)
            System.out.print(output[a] + " ");
    }
}