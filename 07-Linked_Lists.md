# Linked Lists

They are a very common data structure in coding interviews, and also used for the basis for other data structures you might use for as well.

So what is a linked list? This data structure works very similarly, at least conceptually, to an array. It differs to arrays on the method it is implemented or how its elements are stored on the memory. Let's check out the following:

```javascript
[1, 2, 3]
```

When declaring either a dynamic or static array the operating system will try to locate 3 random free back-to-back memory spaces. Arrays are conceptually read left to right, the same goes for a singly linked list, the difference relies on how they are stored in memory.

Arrays need to store the elements in a contiguous memory space, linked list on other hand can store elements in a random order, connecting them using pointers. Just a little recap, pointers are memory slots that store the address of another memory slot. So the structure of a linked list consist in nodes that hold a value and a pointer to another node. 


```javascript
// first node has a value of 1 and a pointer to the second node

{ value: 1, next: { value: 2, next: { value: 3, next: null } } }
```

So each node takes two back-to-back memory slots, one to keep track of the value, and another to keep track of the memory reference of the next node that could be anywhere in memory.

Well what about the null pointer? How does our node really knows that the reference contains nothing, and if it does like so why it has to be null and just not empty? For now, you can think that the operating system manages memory in such a way it has special memory addresses reserved to act like null references.

Now we clearly know what differ an array to a linked list - arrays need contiguous memory slots to store elements, linked list elements can be stored anywhere in memory. That's why the typical way to represent linked lists is by using arrows.

```javascript
[1] -> [2] -> [3]
```

And because your operating system is connected directly to all memory slots on memory, you are able to go from one block the other really fast just by having that memory address to the reference.

Linked lists have different methods from arrays, thus they have different space-time complexity implications.

Let's start talking about retrieving an element at a given position, the `get` method. Because arrays store elements in back-to-back memory slots, you can retrieve an element in constant time, the OS just have to calculate how many slots each element takes and then match the given index with the start of the memory slot of the corresponding element. That's not the same for a linked list, we have to go node for node visiting each memory slot until we found the one that matches the given index. That's going to be `O(i)` time complexity where `i` is the index of the element we are looking for, and since no additional memory is required, the space complexity is going to be `O(1)`. The same happens for the replace operation, the `set` method. We need to visit each memory slot until we found the one that matches the given index, and then overwrite the value of that memory slot. That's going to be `O(i)` time complexity and `O(1)` space complexity.

The fact is that there is no such a thing like indexes when we talk about linked lists, they're nodes that keep track of a value and a pointer to another node.

The initialization of a linked list is going to be `O(N)` space-time complexity. And just because we have to traverse the entire structure to know each node values, the `copy` method also has `O(N)` space-time complexity. Now remember when we define that the `insert` and `delete` operations on arrays take `O(N)` space-time complexity because the OS would have to shift the memory address to another slot and may happen that we hit some edge case where we hit the buffer, that means the extra space reserved to dynamic arrays and the OS would have to double the amount of memory that we've allocated to it. All of these operations can be done in constant time in linked lists.

When we attempt to insert a value at the beginning, what happens under the hood is that the OS just need to replace the so-called head node for a new one, so two random memory slots are selected to store the new value and a reference to the old head node. So each node that doesn't have a node pointing to them is defined as the head node, so our linked list keeps reference to a variable that points to the first node, when we insert a new value to the beginning of that linked list, we are just allocating a new memory slot and updating that variable, making it `O(1)` space-time complexity.

But when we attempt to insert a value in somewhere else in the middle of the linked list, we need to traverse all the nodes until reach the desired position where you want to insert the new node and once you reach that node, you can just insert the new node there. So we have to traverse the whole linked list until reach the node at the required position, allocate a new memory slot to the new node, and update the reference of the previous, making it takes `O(i) + 1` space-time complexity.

Finally, when we attempt to insert a value at the end of the linked list, we are in fact updating our so-called tail node, that one that points to `null`. Depending on the implementation, you don't need to traverse all the structure till reach the tail, some linked lists may keep reference of the tail node and in that case the space-time complexity is going to be `O(1)`, if that's not the case than the space-time complexity is going to be `O(N) + 1`.

See how it depends on whether you have the reference of the node where you're inserting the new node or not. In case you have it, them it's going to happen at constant time, if you don't have it, then it's going to be `O(i) + 1` space-time complexity because you need to traverse the whole linked list until reach the node at the desired position.

What makes linked lists very cool is that there are plenty of variations on it. Until here we have only demonstrating how things work in a singly linked list, which is the most basic implementation of a linked list, where you have a **link** between two values. A doubly linked list uses two pointers to keep track of the previous and the next node, in that case the previous node of the head points to `null` and the next node of the tail points also to `null`. So if a singly linked list each node needs two memory slots, one for the value and another one for the next pointer, a doubly linked list would take three memory slots for each node, one for the value, another one for the next pointer and another one for the previous pointer. In that way, doubly linked lists enables us to go back on the nodes, and mutations can be done making it circular if we want to go from tail to head, and that's what makes linked lists so versatile and useful.

## Resume

### Singly Linked List
    
A data structure that consists of nodes, each with some value and a pointer to the next node in the linked list. A linked list node's value and next node are typically stored in value and next properties, respectively.

The first node in a linked list is referred to as the head of the linked list, while the last node in a linked list, whose next property points to the null value, is known as the tail of the linked list.

Below is a visual representation of a singly linked list whose nodes hold integer values:

```
0 -> 1 -> 2 -> 3 -> 4 -> 5 -> null
```

A singly linked list typically exposes its head to its user for easy access. While finding a node in a singly linked list involves traversing through all the nodes leading up to the node in question (as opposed to instant access with an array), adding or removing nodes simply involves overwriting next pointers (assuming that you have access to the node right before the node that you're adding or removing).

The following are a singly linked list's standard operations and their corresponding time complexities:

- Accessing the head: **O(1)**
- Accessing the tail: **O(n)**
- Accessing a middle node: **O(n)**
- Inserting / Removing the head: **O(1)**
- Inserting / Removing the tail: **O(n) to access + O(1)**
- Inserting / Removing a middle node: **O(n) to access + O(1)**
- Searching for a value: **O(n)**

### Doubly Linked List

Similar to a singly linked list, except that each node in a doubly linked list also has a pointer to the previous node in the linked list. The previous node is typically stored in a prev property.

Just as the next property of a doubly linked list's tail points to the null value, so too does the prev property of a doubly linked list's head.

Below is a visual representation of a doubly linked list whose nodes hold integer values:

```
null <- 0 <-> 1 <-> 2 <-> 3 <-> 4 <-> 5 -> null
```

While a doubly linked list typically exposes both its head and tail to its user, as opposed to just its head in the case of a singly linked list, it otherwise behaves very similarly to a singly linked list.

The following are a doubly linked list's standard operations and their corresponding time complexities:

- Accessing the head: **O(1)**
- Accessing the tail: **O(1)**
- Accessing a middle node: **O(n)**
- Inserting / Removing the head: **O(1)**
- Inserting / Removing the tail: **O(1)**
- Inserting / Removing a middle node: **O(n) to access + O(1)**
- Searching for a value: **O(n)**

## Circular Linked List

A linked list that has no clear head or tail, because its "tail" points to its "head," effectively forming a closed circle.

A circular linked list can be either a singly circular linked list or a doubly circular linked list.
