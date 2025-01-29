public class Trie {

    private final Node root;

    public Trie() {
        root = new Node('\0');
    }

    public void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    public Node getNode(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node(c);
            }

            curr = curr.children[c - 'a'];
        }
        return curr;
    }

}
