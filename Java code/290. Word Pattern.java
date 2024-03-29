class Solution {
    public boolean wordPattern(String pattern, String s) {
         String words[] = s.split(" ");
        if(words.length != pattern.length()) return false;
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character > wordToChar = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            charToWord.put(c, word);
    
            if(wordToChar.containsKey(word)) {
                if(c != wordToChar.get(word)) {
                    return false;
                }
            } else {
                wordToChar.put(word, c);
            }
        }
        return wordToChar.size() == charToWord.size();
    }
}
