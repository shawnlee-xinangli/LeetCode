class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int[] presum = new int[nums.length];
        presum[0] = nums[0];
        if (presum[0] == k) res++;
        for (int i = 1;i<nums.length;i++) {
            presum[i] = nums[i] + presum[i-1];
            if (presum[i] == k) res++;
            for (int j = 0;j<i;j++) {
                if (presum[i]-presum[j] == k) res++;
            }
        }
        return res;
    }
}

/*
  Time Complexity: O(n^2)
  Space Complexity: O(n)
  时间复杂度高了些。
*/

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}

/*
  构建Map，记录每种presum出现的次数，需要在初始位置添加[0,1]来处理sum == k的情况。
  时间复杂度就是O(n).
*/
