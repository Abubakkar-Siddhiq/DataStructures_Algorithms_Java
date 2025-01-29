public class Node {
    public char c;
    public Node[] children;
    public boolean isWord;

    public Node(char c) {
        this.c = c;
        this.children = new Node[26];
        this.isWord = false;
    }
}
