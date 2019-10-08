class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int max = 0;
        for (int i = A.length-1;i>=2;i--) {
            if (A[i]<A[i-1]+A[i-2]) {
                max = A[i]+A[i-1]+A[i-2];
                break;
            }
        }
        return max;
    }
}

/**
利用Sort以后数组的性质，Time Complexity = O(nlogn).
*/
