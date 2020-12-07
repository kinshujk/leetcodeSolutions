class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ans = new int[nums.length];
        
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++)
        {
            ans[i] = ans[i-1]*nums[i-1];
        }
        
        for(int j = nums.length-1; j >= 0; j--)
        {
            ans[j] = ans[j] * product;
            product *= nums[j];
        }
        return ans;
    }
}
