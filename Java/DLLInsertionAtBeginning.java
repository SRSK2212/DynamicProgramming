public class DLLInsertionAtBeginning{
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next=null;
        }
    }
    Node head;
    public void insertAtBeginningDLL(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DLLInsertionAtBeginning dll= new DLLInsertionAtBeginning();
        
        dll.insertAtBeginningDLL(400);
        dll.insertAtBeginningDLL(300);
        dll.insertAtBeginningDLL(200);
        dll.insertAtBeginningDLL(100);
        
        System.out.println("Doubly Linked List after insertion:");
        dll.display();
    }
}