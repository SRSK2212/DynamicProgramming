class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class insertionAtEndLL:
    
    def __init__(self):
        self.head = None
    
    def insertAtEnd(self, newNode):
        newNode = Node(newNode)
        if self.head == None:
            self.head = newNode
        else:
            current = self.head
            while(current.next!=None):
                current = current.next
            current.next = newNode
    def displayLinkedList(self):
        current = self.head
        if(current!=None):
            print("Linked list contains: ", end=" ")
            while(current!=None):
                print(current.data, end=" ")
                current = current.next
            print()
        else:
            print("Linked list is empty")

ll = insertionAtEndLL()
ll.insertAtEnd(1)
ll.insertAtEnd(2)
ll.insertAtEnd(3)
ll.displayLinkedList()