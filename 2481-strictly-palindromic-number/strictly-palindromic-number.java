class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int n1=n,n2=n,bi=0,carry=1,rev=0;
        while(n1!=0)
        {
            bi=bi+n1%2*carry;
            carry*=10;
            n1/=2;
        }
        while (n2!=0)
        {
            rev=rev*10+n2%10;
            n2/=10;
        }
        return bi==rev;
    }
}