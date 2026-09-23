class Solution {
    public int reverse(int n) 
    {
        long rev = 0;
        
        int a =0;
        while(n!= 0)
        {
         a = n%10;
         rev = rev*10+a;
         n = n/10;
        }
        if(rev> Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int) rev;
        
    }
}