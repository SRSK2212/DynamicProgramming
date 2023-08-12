public class insertionAtEndLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertionAtEndLL ll = new insertionAtEndLL();
        
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        
        System.out.println("Linked List after insertion:");
        ll.display();
    }
}
