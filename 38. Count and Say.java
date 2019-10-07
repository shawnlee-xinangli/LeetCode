class Solution {
   public String countAndSay(int n) {
        if (n == 1) {return "1";}
        return nextNumber(countAndSay(n-1)); 
    }
    private static String nextNumber(String s){ 
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){ 
            int count = 1; 
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i+1)){ 
                i++; 
                count++; 
            }
            result.append(count).append(s.charAt(i)); 
        }
        return result.toString(); 
    }
}

/*
我的解：递归；构建next0f(countAndSay(n-1)); start from i = 1, 先判断是否为最后一个字符，再判断是否和前一个字符一样。
最优解：递归；构建nextNumber();for 循环里构建一个小的while循环，如果和s[i]后一个字符相同,在while循环内让i++,count++;使用stringbuilder。
*/
