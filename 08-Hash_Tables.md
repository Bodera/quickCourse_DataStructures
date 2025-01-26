# Hash Tables

Hash tables are an extremely powerful data structure, it's simple and comes built-in on most programming languages. Behind scenes, they aren't that easy to understand, that's they trade off for performance.

Essentially speaking, a hash table is a key-value store. It's a data structure where you're able to store pairs of keys and values, where every key maps to a value, making it possible to retrieve some value given a key, but not the other way around.

Methods like `get`, `insert`, and `delete` are all operations that happens at constant time in hash tables, which means they have `O(1)` space-time complexity. That makes them look just like ordinary arrays, right? In an array we also have some like key-value pairs, if you consider index as the key. The beauty of hash tables is that our indexes (keys) don't necessarily have to be numbers, they can be strings, or anything else.

So how that's possible to have a constant time lookup with a key that isn't a number or an integer? It turns out that hash tables are built on top of arrays with three indexes. Behind the scenes when you're inserting a key-value pair inside a hash table and this is where the word hash comes into play, you use what's called a hash function to transform the key into an index which will fit in some underlying array. And similarly, when you're retrieving a value from a hash table, you use the same hash function to retrieve the index of the key, and then retrieve the value from the underlying array at that index.

But what is a hash function, how those keys are transformed into indexes? First we need to convert the key into an integer, and there are many ways to do that. For strings, you can for example map every character in the string to its ASCII character encoding, you're going to be left with one integer per character in the string, then you sum up all those integers, and you get a number.

Ok we got the integer, what's next? This is where the modulo operator comes into play, we retrieve the modulo of our integer for the length of the underlying array, it always returns a number between 0 and the length of the array minus one. Remember the modulo is the remainder of the division between two numbers.

So far so good, we've stored our key-value pairs into our array under the hood by using this hash function to find the relevant indices for each key and now if we want to look up for a given key, we just have to run our key through the same hashing function. But what if some other key have the same hash value? It's very possible that two strings might map to the same index given a hashing function. Well turns out that a hash table isn't just an array, it's an array where each index maps to a linked list of potential values, that's precisely takes care of instances where we have two keys that get hashed into the same index, and they therefore collide. This is known as a collision in a hash table.

This is where we need to store even more information, we actually need every node in the linked list to point back to the original key, this is very important because otherwise we would not be able to know which of those values are related for the given key. So if we can have keys that collide with one another and that are stored in one linked list inside an array, then in the worst case we could have every single key that collides we literally just have one linked list, and the other linked lists have nothing and one linked list of length **n**, and still inserting, searching and deletion runs at `O(1)` time? Not in this case, on average a hash table runs at `O(1)` time, but in a scenario like this it will run at `O(n)` time.

But smart people across the world came up with powerful hashing functions that can be used to minimize the number of collisions. In other words, the popular hash tables implementations that exist out there in the real world use very fancy and powerful hashing functions that minimize the number of collisions. Such that we can truthfully accept that a hash table runs at `O(1)` time on average. If you are warned that there is need to handle potential edge cases, then you should be aware that the worst case time complexity for a hash table is `O(n)`.

And what about when we run out of space in our underlying array? Then we have to talk about resizing hash tables, a hash table can be able to resize itself, too much complicated stuff here, in simple terms you could imagine that it works like a dynamic array, which copies the entire array to a new available memory location where there are enough memory slots for the new element, passing the keys to a new hash function before storing them in the new array.

## Resume

### Hash Table
A data structure that provides fast insertion, deletion, and lookup of key/value pairs.

Under the hood, a hash table uses a dynamic array of linked lists to efficiently store key/value pairs. When inserting a key/value pair, a hash function first maps the key, which is typically a string (or any data that can be hashed, depending on the implementation of the hash table), to an integer value and, by extension, to an index in the underlying dynamic array. Then, the value associated with the key is added to the linked list stored at that index in the dynamic array, and a reference to the key is also stored with the value.

Hash tables rely on highly optimized hash functions to minimize the number of collisions that occur when storing values: cases where two keys map to the same index.

Below is an example of what a hash table might look like under the hood:

```
[
  0: (value1, key1) -> null
  1: (value2, key2) -> (value3, key3) -> (value4, key4)
  2: (value5, key5) -> null
  3: (value6, key6) -> null
  4: null
  5: (value7, key7) -> (value8, key8)
  6: (value9, key9) -> null
]
```

In the hash table above, the keys **key2**, **key3**, and **key4** collided by all being hashed to **1**, and the keys **key7** and **key8** collided by both being hashed to **5**.

The following are a hash table's standard operations and their corresponding time complexities:

- Inserting a key/value pair: **O(1)** on average; **O(n)** in the worse case
- Removing a key/value pair: **O(1)** on average; **O(n)** in the worse case
- Looking up a key: **O(1)** on average; **O(n)** in the worse case

The worst-case linear-time operations occur when a hash table experiences a lot of collisions, leading to long linked lists internally, which take O(n) time to traverse.

However, in practice and especially in coding interviews, we typically assume that the hash functions employed by hash tables are so optimized that collisions are extremely rare and constant-time operations are all but guaranteed.