// Write a Java program to convert total time entered in seconds from the user to
// hour, minute and seconds.

import java.util.*;

public class TotalTime
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total time in seconds: ");
        int totalTime = sc.nextInt();
        int hours = totalTime / 3600;
        int minutes = (totalTime - (hours*3600))/60;
        int seconds = totalTime - (hours*3600 + minutes*60);

        System.out.println(totalTime+" seconds: " + hours+" hours, "+minutes+" minutes and "+seconds+" seconds");
        sc.close();
    }
}