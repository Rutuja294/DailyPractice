package collections;

class Main {

    // Function to find the kth node from the last of a linked list
    static int findKthFromLast(Node head, int k) {
        int len = 0;

        // Pointer to store the copy of head
        Node temp = head;

        // Count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Check if value of k is not more than length of the linked list
        if (len < k)
            return -1;

        temp = head;

        // Get the (len - k + 1)th node from the beginning
        for (int i = 1; i < len - k + 1; i++)
            temp = temp.next;

        return temp.data;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list: 35 -> 15 -> 4 -> 20
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        // Function Call to find the 4th node from end
        System.out.println(findKthFromLast(head, 4));
    }
}
