package activity10;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        int size;
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter an integer (size of list): ");
        size = kbd.nextInt();

        queueTest(listGenerator(size));

        kbd.close();
    }

    public static void queueTest(Node head) {
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        while (head != null) {
            queue.add(head.item);
            head = head.next;
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.getFirst());
            queue.removeFirst();
        }
    }

    public static Node listGenerator(int size) {
        Node head = null;
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            head = new Node(rand.nextInt(100), head);
        }

        return head;
    }
}
