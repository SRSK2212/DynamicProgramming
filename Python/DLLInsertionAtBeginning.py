class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None
class DLLinsertionAtBeginning:
    
    def __init__(self):
        self.head = None
    
    def insertionAtBeginning(self, newNode):
        newNode = Node(newNode)
        if self.head == None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head.prev = newNode
            self.head = newNode
    def displayDoublyLinkedList(self):
        current = self.head
        if(current!=None):
            print("Linked list contains: ", end=" ")
            while(current!=None):
                print(current.data, end=" ")
                current = current.next
            print()
        else:
            print("Linked list is empty")

dll = DLLinsertionAtBeginning()
dll.insertionAtBeginning(400)
dll.insertionAtBeginning(300)
dll.insertionAtBeginning(200)
dll.insertionAtBeginning(100)
dll.displayDoublyLinkedList()