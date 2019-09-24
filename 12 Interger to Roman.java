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
