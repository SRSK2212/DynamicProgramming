
# lists are dynamic arrays in python
list1 = []
print("\nlength of list before adding elements= ", len(list1))
# adding elements to list 
list1 = [2,2,1,2]

print("\nlist elements= ", list1)
print("current length of list = ", len(list1))

# another way of adding elements, using append
list1.append('SRSK')

print("\nlist elements= ", list1)
print("current length of list = ", len(list1))

# removing elements  using pop
list1.pop()
print("\nlist elements after pop = ", list1)

# declaring list of size 20
list2 = [None]*20
print("\nlenght of list2 = ", len(list2))
