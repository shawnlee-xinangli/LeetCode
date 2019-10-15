class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            j++;
            while (sum >= s) {
                len = Math.min(len,j-i);
                sum -= nums[i];
                i++;
            }
        }
        return len == Integer.MAX_VALUE? 0 : len;
    }
}

/*
  双指针法，先移动j指针，使nums[i:j]的sum >= s，update len，这时候的nums[i:j]一定是valid但不一定是min的，
  因此我们需要移动指针i，更新nums[i:j]的sum，直到sum < s，然后再移动j，重复上述过程，直到j = nums.length - 1。
*/
