import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        int a = 0;
        long rev = 0;
        while(n!=0)
        {
            a = n %10;
            rev = rev*10+a;
            n=n/10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            {
                System.out.println("Error");
            }
            
            System.out.println(rev);
    }
}