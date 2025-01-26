# Queues and Stacks

There are interesting data structures commonly used in coding interviews. Easy to grasp due to they intuitive, real-life examples, and easy implementation. What is a stack, and what is a queue?

You can imagine a stack as a stack of books on a table, on top of each other, so when you add something on a stack, you would add it on top. Similarly, if you were to remove a book from the stack, you also remove the one on the top, because removing a book from the bottom or the middle will make the other books to fall over. The key principle of a stack is a data structure that supports inserting and removing elements following the last-in-first-out (LIFO) principle. In other words, the last element that was added to the stack is the first one to be removed.

Queues are the opposite of stacks, you can imagine queues as a line of people waiting to buy tickets for a movie, and so here, if you want to add an element to the queue, you can imagine someone getting in the line to buy a ticket, where would they go? Unless they want to cut the line, they would go to the back of the line. And the first person who would go to get out of the line would be the person who first got into the line. As you can tell this type of structure follows a different principle. The first-in-last-out (FIFO) principle.

Let's look at the actual implementations of these two data structures. Perhaps the best way to introduce the implementation of stacks and queues would be to look at the space-time complexity ramifications of the operations that you can perform on them. What is nice about them is that they support constant space-time complexity for insertion and deletion of elements. A stack is really can be implemented as dynamic array, you `push` and `pop` things on it, which means that searching for an arbitrary element in the stack is going to take linear time, because you need to traverse the whole stack to find the element, and you can't add elements to the stack anywhere else but the top of the stack.

Is a queue implementable using a dynamic array? No, a queue needs to be implemented with a different data structure, typically a linked list. The `enqueue` is typically the method used to inserting elements to a queue, you use it to replace an element from the linked list, the `dequeue` is typically the method used to remove elements from a queue, you use it to delete the tail of the linked list.

As you can tell stacks and queues are slightly more involved from an implementation point-of-view. Beyond the space-time complexity ramifications stacks and queues are very basic data structures, but you can actually make them a lot more complicated and powerful. A stack could be transformed into a MaxStack or MinStack, meaning a stack that also keeps tracks of the largest element in it, or the smallest element in it. For queues, you can turn them into what's called a priority queue, which keeps track of an element with high priority.

Both structures support a `peek` method, which allows you to see the element at the top of the stack or the element at the front of the queue.

## Resume

### Stack

An array-like data structure whose elements follow the LIFO rule: Last In, First Out.

A stack is often compared to a stack of books on a table: the last book that's placed on the stack of books is the first one that's taken off the stack.

The following are a stack's standard operations and their corresponding time complexities:

- Pushing an element onto the stack: **O(1)**
- Popping an element off the stack: **O(1)**
- Peeking at the element on the top of the stack: **O(1)**
- Searching for an element in the stack: **O(n)**

A stack is typically implemented with a dynamic array or with a singly linked list.

### Queue

An array-like data structure whose elements follow the FIFO rule: First In, First Out.

A queue is often compared to a group of people standing in line to purchase items at a store: the first person to get in line is the first one to purchase items and to get out of the queue.

The following are a queue's standard operations and their corresponding time complexities:

- Enqueuing an element into the queue: **O(1)**
- Dequeuing an element out of the queue: **O(1)**
- Peeking at the element at the front of the queue: **O(1)**
- Searching for an element in the queue: **O(n)**

A queue is typically implemented with a doubly linked list.