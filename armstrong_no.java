import java.util.*;
public class armstrong_no {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        int a = 0;
        int temp = n;
        int n1 = n;
        int count = 0;
        int b = 0;
        while(temp!=0)
        {
            count++;
            temp = temp /10; 
        }
        
        while(n!=0)
        {
            a = n % 10;
            b = (int) b + Math.powExact(a,count);
            n = n /10;
        }
        if (b==n1)
        {
            System.out.println(b+" is an armstrong no");
        }
        else 
        {
            System.out.println("not an armstrong no");
        }
    }
}
