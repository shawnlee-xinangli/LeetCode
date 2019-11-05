class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] splited = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : splited) {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for (String bannedword : banned) {
            map.remove(bannedword);
        }
        String res = "";
        for (String word : map.keySet()) {
            if (res == "" || map.get(res) < map.get(word)) {
                res = word;
            }
        }
        return res;
    }
}

/*
  注意split里面的符号。
*/
