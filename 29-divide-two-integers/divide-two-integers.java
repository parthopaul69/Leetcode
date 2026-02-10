class Solution {
    public int divide(int dividend, int divisor) {
        long out=(long)dividend/divisor;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        if(out>max)
        {
            return max;
        }
        else if(out<min)
        {
            return min;
        }
        else
        {
            return (int)out;
        }
    }
}