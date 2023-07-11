class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def insertAtBeginning(self, newNode):
        newNode = Node(newNode)
        newNode.next = self.head
        self.head = newNode
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

ll = LinkedList()
ll.insertAtBeginning(100)
ll.insertAtBeginning(200)
ll.insertAtBeginning(300)
ll.insertAtBeginning(400)
ll.displayLinkedList()
