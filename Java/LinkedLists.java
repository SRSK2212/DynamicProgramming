public class LinkedLists {
    // node in the linked list
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    // head and tail of linked list
    Node head = null;
    Node tail = null;
    // adding new node to the beginning of the list.
    public void insertAtBeginning(int data){
        // creating a new node 
        Node newNode = new Node(data);
        // checking if the Linked List is empty
        if(head==null){
            // if its empty, head and tail will points to new node
            head = newNode;
            tail = newNode;
        }
        else{
            // new node points to old head
            newNode.next = head;
            // new node becomes new head
            head = newNode;
        }
    }
    // display linked list
    public void displyLinkedList(){
        // current points to head
        Node current = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Inserting new node at the beginning");
        while(current!=null){
            System.out.println(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedLists ll = new LinkedLists();
        ll.insertAtBeginning(100);
        ll.displyLinkedList();
        ll.insertAtBeginning(200);
        ll.displyLinkedList();
        ll.insertAtBeginning(300);
        ll.displyLinkedList();
        ll.insertAtBeginning(400);
        ll.displyLinkedList();
        
    }
}
