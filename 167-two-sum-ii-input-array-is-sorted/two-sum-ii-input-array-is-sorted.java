class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,length=numbers.length-1;
        while(i<length)
        {
            if(numbers[i]+numbers[length]==target)
            {
                return new int[]{i+1,length+1};
            }
            else if(numbers[i]+numbers[length]<target)
            {
                i++;
            }
            else
            {
                length--;
            }
        }
        return null;
    }
}