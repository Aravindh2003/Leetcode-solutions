class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        dictionary.forEach(root -> insert(root));
        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split(" ")) {
            sb.append(getRootWord(word)).append(" ");
        }
        return sb.toString().trim();
    }

    class TrieNode {
        Map<Character, TrieNode> links;
        boolean isEndOfWord;

        public TrieNode() {
            links = new HashMap<>();
            isEndOfWord = false;
        }
    }

    TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            TrieNode charNode = node.links.get(c);
            if (charNode == null) {
                charNode = new TrieNode();
                node.links.put(c, charNode);
            }
            node = charNode;
        }
        node.isEndOfWord = true;
    }

    public String getRootWord(String word) {
        if (root.links.get(word.charAt(0)) == null)
            return word;

        TrieNode node = root;
        StringBuilder rootWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            rootWord.append(c);
            TrieNode charNode = node.links.get(c);
            if (charNode == null)
                return word;
            if (charNode != null && charNode.isEndOfWord)
                return rootWord.toString();
            node = charNode;
        }
        return word;
    }
}
