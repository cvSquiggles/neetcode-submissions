class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums)
        {
             map.compute(i, (key, value) -> (value == null) ? 1 : value + 1);
        }

        int bucketSize = nums.length+1;
        List<Integer>[] buckets = new List[bucketSize];

        for(Integer x : map.keySet())
        {
            if(buckets[map.get(x)] == null)
            {
                buckets[map.get(x)] = new ArrayList<Integer>();
            }

            buckets[map.get(x)].add(x);
        }

        int[] result = new int[k];
        int index = 0;

        for(int z = bucketSize - 1; z >= 0 && index < k; z--)
        {
            if(buckets[z] != null)
            {
                for(Integer g : buckets[z])
                {
                    if(index < k)
                    {
                        result[index] = g;
                        index++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }

     return result;   
    }
}
