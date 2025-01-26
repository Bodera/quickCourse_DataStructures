# Strings

We generally think of a string as a data type, one of the fundamental data types along with integers, for instance or Boolean. That being said, strings do behave sort of like data structures that we can manipulate them, manipulating them definitely has space-time complexity implications and so for those reasons we're going to treat them as data structures.

Strings are particularly tricky because they're implemented quite differently, depending on the programming language you're using. A string is typically stored in memory as an array of integers where each character has been mapped to an integer. The way this is done is through some sort of character and coding standards, one of the popular ones is ASCII, and if we're dealing with ASCII coding standard then we have a range of 256 possible characters, and each of them are going to be stored in memory as one byte of 8 bits. When dealing with characters that are not encoded in ASCII, we typically use other character encoding standards and those are going to require more space. The main point to make here is that every character in a string is going to be stored in memory using a fixed amount of bytes, hence when we're dealing with a single character in a string, all the operations we're going to perform runs at a constant time. Just like they would be if we were dealing with one fixed-width integer.

If we're traversing through a string, just like on an array, it's a `O(n)` time complexity but `O(1)` space complexity. Things like copying a string are going to be `O(n)` time complexity and `O(n)` space complexity. If we want to get the character at a given index in a string is going to be `O(1)` time complexity and `O(1)` space complexity.

Now where the things get interesting is when we try to actually mutate the string. So for instance, if we try to insert a value in a string or at the end of the string. In some languages, like C++, strings are mutable, meaning you can alter them, you can add characters to them. In other languages, like Python, Java, JS, C#, Go, strings are immutable. Meaning you can not alter them after they have been created. Trying to alter them in one of those languages, is actually creating just new strings, by copying them. And doing so does not run at constant space-time complexity, it's going to be `O(n)` space-time complexity. The length of the first string times plus the length of the second string. This is why for those languages, it's often recommended if you have to do a lot of alterations to do a single string, to split out the string into an actual array of characters in code, and they provide built-in methods for doing that, where you can append values at constant time, to finally rejoin all of these letters. Instead of performing lots of `O(n)` operations, you performed a single `O(n)` operation.

## Resume

### String

One of the fundamental data types in Computer Science, strings are stored in memory as arrays of integers, where each character in a given string is mapped to an integer via some character-encoding standard like ASCII.

Strings behave much like normal arrays, with the main distinction being that, in most programming languages (C++ is a notable exception), strings are immutable, meaning that they can't be edited after creation. This also means that simple operations like appending a character to a string are more expensive than they might appear.

The canonical example of an operation that's deceptively expensive due to string immutability is the following:

```
string = "this is a string"
newString = ""
for character in string:
newString += character
```

The operation above has a time complexity of **O(n^2)** where n is the length of `string`, because each addition of a character to `newString` creates an entirely new string and is itself an **O(n)** operation. Therefore, `n O(n)` operations are performed, leading to an `O(n^2)` time-complexity operation overall.