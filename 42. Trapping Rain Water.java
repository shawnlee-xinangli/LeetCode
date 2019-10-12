class Solution {
    public int trap(int[] h) {
        int i = 0;
        int j = h.length-1;
        int res = 0;
        int leftmax = 0;
        int rightmax = 0;
        while (i<=j) {
            leftmax = Math.max(h[i],leftmax);
            rightmax = Math.max(h[j],rightmax);
            if (leftmax<rightmax) {
                res += leftmax-h[i];
                i++;
            }
            else {
                res += rightmax-h[j];
                j--;
            }
        }
        return res;
    
    }  
}

/*
  双指针i,j，移动的同时分别更新leftmax和rightmax,根据木桶原理，能装的水取决于Math.min(leftmax,rightmax),
  即使离i/j位置最近的bar比leftmax/rightmax短,能装的水依然取决于Math.min(leftmax,rightmax),
  当然不要忘记减去h[i]/h[j]，可以理解为木桶的底。
*/
