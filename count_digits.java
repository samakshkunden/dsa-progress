import java.util.*;
class count
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        int a = 0;
        int b = 0;
        while(n!=0)
        {
            a++;
            n=n/10;
        }
        System.out.println("No of digits are = "+a);
    }
}