class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int length = nums.length / 2;
        for(int x: nums)
        {
            frequency.put(x, (frequency.getOrDefault(x, 0) + 1));
            if(frequency.get(x) > length)
                return x;
        }
        return -1;
    }
}
