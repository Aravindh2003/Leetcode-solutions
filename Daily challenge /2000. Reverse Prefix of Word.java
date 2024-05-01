class Solution {
    public String reversePrefix(String word, char ch) {
       int found = word.indexOf(ch); 
       word = new StringBuilder(word.substring(0, found + 1)).reverse() + word.substring(found + 1);
       return word;
    }
}
