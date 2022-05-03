package activity10;

public class Node {
    protected int item;
    protected Node next;

    Node(int item) {
        this.item = item;
        next = null;
    }

    Node(int item, Node next) {
        this.item = item;
        this.next = next;
    }
}
