class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0||(x % 10 == 0 && x != 0))
       { return false;
       }
       int rev = 0;
       int temp = x;
       int a = 0;
       while (temp>rev)
       {
         a = temp%10;
         rev = rev*10 + a;
         temp = temp/10;
       }
     return rev == temp || rev / 10 == temp;
    }
}