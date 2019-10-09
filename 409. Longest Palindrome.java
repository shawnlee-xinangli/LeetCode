class Solution {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] map= new int[100];
        for (char c:chars) {
            map[c-'A']++;    
        }
        int res = 0;
        for (int i : map) {
            if (i % 2 == 1) {
                res += i-1;
                if (res % 2 == 0) {
                    res++;
                }
            }
            else{
                res += i;
            } 
        }
        return res;
    }
}

/*
  遍历string，统计每个字符出现的次数，
  然后遍历map，如果次数为偶数，说明该字符可以被添加进result，
  如果次数为奇数，说明该字符不能全部添加进去（只有当result长度为偶数时才需要中心，才可以添加奇数个数）。
*/
