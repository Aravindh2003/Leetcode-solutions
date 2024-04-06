class Solution {
    public String minRemoveToMakeValid(String s) {
        ArrayList<Character> chars = new ArrayList<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                chars.add(c);
            } else if (c == ')' && count > 0) {
                count--;
                chars.add(c);
            } else if (c != ')') {
                chars.add(c);
            }
        }
        count = 0;
        StringBuilder res = new StringBuilder();
        for (int i = chars.size() - 1; i >= 0; i--) {
            char c = chars.get(i);
            if (c == ')') {
                count++;
                res.append(c);
            } else if (c == '(' && count > 0) {
                count--;
                res.append(c);
            } else if (c != '(') {
                res.append(c);
            }
        }
        
        return res.reverse().toString();
    }
}
