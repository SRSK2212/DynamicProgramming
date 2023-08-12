class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class InsertAtPositionLL:
    
    def __init__(self):
        self.head = None
    
    def insertAtGivenPosition(self, newNode, position):
        newNode = Node(newNode)
        if position == 1:
            newNode.next = self.head
            self.head = newNode
        else:
            current = self.head
            for i in range(0, position-2):
                if current != None:
                    current = current.next
            if current==None:
                print("Invalid Position")
                return
            newNode.next = current.next
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

ll = InsertAtPositionLL()
ll.insertAtGivenPosition(1, 1)
ll.insertAtGivenPosition(3, 2)
ll.insertAtGivenPosition(5, 3)
ll.displayLinkedList()