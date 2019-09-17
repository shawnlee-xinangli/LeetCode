class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        return nextOf(countAndSay(n-1));
    }
    
    public String nextOf(String str) {
        if (str == "1") {return "11";}
        
        char[] c = str.toCharArray();
        char curr = c[0];
        int count = 1; 
        String res = "";
        
        for (int i = 1;i<c.length;i++) {
            if (i == c.length-1) {
                if (curr == c[i]){
                    count++;
                    res += String.valueOf(count);
                    res += String.valueOf(curr);
                    break;
                }else {
                    res += String.valueOf(count);
                    res += String.valueOf(curr);
                    curr = c[i];
                    count = 1;
                    res += String.valueOf(count);
                    res += String.valueOf(curr);
                    break;
                }
                
            }else {
                if (curr == c[i]){
                    count++;
                    continue;
                }
                else {
                     res += String.valueOf(count);
                     res += String.valueOf(curr);
                     curr = c[i];
                     count = 1;
                }
            }
        }
        return res; 
    }
}
