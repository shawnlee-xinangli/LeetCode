class Solution {
    public String intToRoman(int num) {
       	
	    StringBuilder sb = new StringBuilder();
        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0;
        while (num >0) {
            while (num>=vals[i]) {
                num -= vals[i];
                sb.append(symbols[i]);
            }
            i++;
        }
        return sb.toString();
        
    }
}
/*
手动构造两个array，一个储存val数量级,一个储存string；
令index i = 0，通过while循环找出每次循环时num的最大数量级，
根据数量级对应的字符append,并且使num下降那个数量级，然后需要再次判断num是否还在那个数量级以上，
如果在，再次下降并append，否则直接i++判断是否在下一个数量级。
*/

