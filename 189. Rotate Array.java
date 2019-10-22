class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            rotateOnce(nums);
        }
    }
    
    public void rotateOnce(int[] nums) {
        int last = nums[nums.length-1];
        for (int i = nums.length-1;i>=1;i--) {
            nums[i] = nums[i-1];
        }
        nums[0] = last;
    }
}

/*
  Brute Force: O((k-1)*n);
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
    
    public void reverse(int[] nums,int i, int j) {
        while (i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

/*
  翻折法: 
  nums=[1,2,3,4,5,6,7]; k = 3.
  Step 1: nums[7,6,5,4,3,2,1].
  Step 2: nums[5,6,7,4,3,2,1].
  Step 3: nums[5,6,7,1,2,3,4].
  O(n/2)+O(k/2)+O((n-k)/2) = O(n). 
*/
