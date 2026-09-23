import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {Scanner scn = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        int temp = n;
        int a = 0;
        long rev = 0;
        while(n!=0)
        {
            a = n %10;
            rev = rev*10+a;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println(temp+" is a palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
