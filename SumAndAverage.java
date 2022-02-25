// Write a program in Java to input 5 numbers from keyboard and find their sum and
// average.

import java.io.*;

public class SumAndAverage
{
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int summation = 0;
        float average = 0.0f;

        System.out.println("Enter 5 numbers one by one ... ");
        for(int i=1; i<=5; i++)
            summation += Integer.parseInt(br.readLine());

        average = summation / 5;
        System.out.println("Summation = " + summation);
        System.out.println("Average = " + average);
    }
}