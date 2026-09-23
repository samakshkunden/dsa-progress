import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        int a = 1 ;
        for(int i = 1;i <= n;i ++)
        {
            a = a*i;

        }
        System.out.println("Factorial is "+a);
    }
}
