public class insertAtPositionLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head;
    public void insertAtGivenPositionLL(int data, int position){
        Node newNode = new Node(data);
        if(position==1){
            newNode.next = head;
            head = newNode;
        }else{
            Node current = head;
            for(int i = 1; i<position-1 && current!=null; i++){
                current = current.next;
            }
            if(current==null){
                System.out.println("Invalid Position");
                return;
            }
            newNode.next = current.next;
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
        insertAtPositionLL list = new insertAtPositionLL();
        
        list.insertAtGivenPositionLL(1, 1);
        list.insertAtGivenPositionLL(3, 2);
        list.insertAtGivenPositionLL(5, 3);
        
        System.out.println("Linked List after insertion:");
        list.display();
    }
}
