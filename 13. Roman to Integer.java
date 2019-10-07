class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        char maxchar = 'I';
        for (int i =s.length()-1;i>=0;i--) {
            if (map.get(s.charAt(i))>=map.get(maxchar)) {
                sum += map.get(s.charAt(i));
                maxchar = s.charAt(i);
            }
            else {
                sum -= map.get(s.charAt(i));
            }
        }
        return sum;
    }
}

/*
构建Hash表，put进所有字母；
初始化那个最大的字符为"I"，从右往左遍历字符串，遇到比最大字符大或相等的字符直接加，遇到比最大字符小的字符直接减。
*/
