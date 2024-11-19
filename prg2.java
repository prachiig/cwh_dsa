// Insertion of node in linked list in following conditions:
// At the front of the linked list  
// Before a given node.
// After a given node.
// At a specific position.
// At the end of the linked list.


class Node{
    int data;
    Node next;
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class prg2 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int x = 5;
        // Node ans1 = insertFirst(head, x);
        // printList(ans1);
        Node ans2 = insertBeforeNode(head, x, 20);
        printList(ans2);

    }

    public static void printList(Node head){
        if(head == null)    return;
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    // TC - O(1)
    // SC - O(1)
    public static Node insertFirst(Node head, int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;    
            return head;
        }
        
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertBeforeNode(Node head, int x, int key){
        Node newNode = new Node(x);
        if(head == null){    
            return head;
        }

        Node curr = head;
        
        while(curr.data != key){
            curr = curr.next;
        }
        newNode.next = curr;
        curr = newNode;
        return head;
    }
}
