class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
                 
        int[] map = new int[1001];
        for (int n: arr1) {
            map[n]++;
        }
        int i = 0;
        for (int m: arr2) {
            while (map[m]>0) {
                arr1[i] = m;
                i++;
                map[m]--;
            }
        }
        for (int j = 0;j<map.length;j++) {
            while (map[j]>0) {
                arr1[i] = j;
                i++;
                map[j]--;
            }
        }
        return arr1;
     
    }
}
