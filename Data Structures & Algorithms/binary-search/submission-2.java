class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target)
        {
            return 0;
        }
        
        if(nums.length == 0)
        {
            return -1;
        }
        
        if(nums[nums.length - 1] >= target && target >= nums[0])
        {
            int upperDiff = nums[nums.length - 1] - target;
            int lowerDiff = target - nums[0];

            if(upperDiff < lowerDiff)
            {
                for(int i = nums.length - 1; i > 0; i--)
                {
                    if(nums[i] == target)
                    {
                        return i;
                    }
                }
            }

            if(upperDiff > lowerDiff)
            {
                for(int i = 0; i < nums.length - 1; i++)
                {
                    if(nums[i] == target)
                    {
                        return i;
                    }
                }
            }

        }

        return -1;
    }
}
