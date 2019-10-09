class Solution {
    public String convertToTitle(int n) {
        if (n <= 26) {
           return String.valueOf((char)(n+64)); 
        }
        else if(n % 26 == 0){
            return convertToTitle(n/26 - 1) + "Z";
        }
        return convertToTitle(n/26) + convertToTitle(n % 26);
    }
}

/*
  (char)65 = 'A'
  map:  Z A B C D E F ... Z  ...   AD   ...  AZ  ...  BZ
        0 1 2 3 4 5 6 ... 26 ... 26*1+4 ... 26*2 ... 26*3
  
  26进制
  Recursion
  Base case: n<=26 map[n] = (char) (n+64)
  General case: map[n/26] + map[n % 26]
  Sepcial case: n = 26*k(k>=2). n = 52,78,104...
*/
