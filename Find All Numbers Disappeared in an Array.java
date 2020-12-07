class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // store presence information by making the number at that index negative
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int curr = nums[nums[i] > 0 ? nums[i] - 1 : nums[i] * (-1) - 1];
            nums[nums[i] > 0 ? nums[i] - 1 : nums[i] * (-1) - 1] = (curr > 0) ? (-1)*curr : curr;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] >= 0)
                ans.add(i+1);
        }
        
        return ans;
    }
}
