// Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
// and by both.

public class Divisibility
{
    public static void main(String []args)
    {
        System.out.println("Numbers divisible by 3, 5, and 15 are:- ");
        for(int i=1; i<=100; i++)
        {
            // checking divisibility by 15
            if(i%15 == 0)
                System.out.println(i);

            // checking divisibility by 5
            else if(i%5 == 0)
                System.out.println(i);

            // checking divisibility by 3
            else if(i%3 == 0)
                System.out.println(i);
        }
    }
}