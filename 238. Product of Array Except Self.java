class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        int index = 0;
        for (int i = 0;i<nums.length;i++) {
            if (nums[i] == 0) {
                count++;
                index = i;
                continue;
            }
            product *= nums[i]; 
        }
        int[] res = new int[nums.length];
        if (count == 0) {
            for (int i = 0;i<nums.length;i++) {
                res[i] = product / nums[i];
            }
            return res;
        }
        if (count == 1) {
            res[index] = product;
            return res;
        }
        return res;
        
    }
}

/*
  Special Case: nums中存在0。
  分为没有0，有一个0，有两个0的情况。
*/
