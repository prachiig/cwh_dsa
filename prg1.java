// Traversal of singly linked list


class Node{
    int data;
    Node next;
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}


public class prg1{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Iterative approach: ");
        traverseList(head);
        System.out.println("Recursive approach: ");
        traverseList_recursive(head);
    }

    // TC - O(N) = loop through all nodes
    // SC - O(1) = no extra space
    // iterative approach
    public static void traverseList(Node head){
        Node temp = head;
        if(head == null)    return;
        
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    // TC - O(N) = loop through all nodes
    // SC - O(N) = recursive stack space 
    public static void traverseList_recursive(Node head){
        if(head == null)    return;
        System.out.println(head.data + " ");
        traverseList_recursive(head.next);
    }
}