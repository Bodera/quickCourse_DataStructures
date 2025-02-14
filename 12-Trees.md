# Trees

Trees are one of the most prominent data structures in computer science, software engineering, and of course - coding interviews. When most people hear the phrase Data Structures, they think of a tree, picturing the canonical image of a binary tree.

Now what's interesting about trees is that they're just like graphs and by the way: a tree is a type of graph. Just like with graphs, if you look at the academic definition of a tree, especially the mathematical definition of a tree, a lot of complicated stuff and graph theory (checkout the bibliography of Barabási) - particular complex subjects that may discourage you. For coding interviews, trees are actually quite simple, you just have to be familiar with how they work conceptually, and then you have to practice manipulating them. How? By doing a lot of practice problems.

Don't give up! ᕕ( ᐛ )ᕗ

Let's start by defining what a tree actually is, we already know that is a type of graph, but more specifically, in computer science field add in the context of coding interviews, when we talk about a tree, what we're referring to is a graph structure that is _rooted_. Meaning it has a root node, or conceptually you can think of this as the top node of the structure, and every node has children.

Also, the graph structure of a tree is **directed**, which means the edges have a direction. In this case the edges are typically going to point downwards in the tree. That graph structure is also **acyclic**, so it doesn't have cycles, tree nodes can only have one parent, if not than is just a graph. A tree is not allowed to be disconnected, in other words, you could not have a branch of the tree disconnect, in that case you would have two trees instead.

An example of real life tree could be for example a management chain in a company where you've got a manager who has direct to reports and these direct reports maybe the managers themselves, or other people and so on, that forms a tree-like structure. Another example, if you have human beings who have children and their children have children of their own, that would also form a tree-like structure.

There are a lot of different types of trees, perhaps the most common type of tree is what we call a _binary tree_. You might be familiar with it already, is just a tree where every node has **at most** two child nodes. We also have a _ternary tree_, where nodes could take up to three children. We can generalize this pattern as `k-ary trees`, where `k` is a number that you can choose, and each node can take up to `k` children.

So far, we've covered different types of trees specifically with respect to the number of children nodes that each node can take, but there are other types of trees which differentiate themselves not on the number of children that their nodes have but rather on special properties that they follow. Have you ever heard about binary search trees - **BSTs**? They are a special type of binary tree, where every node in the BST, also satisfies a special BST property. There are also **Heaps**, more specifically **Min-Heaps** and **Max-Heaps**, also referred as binary heaps, they are special binary trees where every node in the tree satisfies this min or max heap property. **Tries** are a tree-like data structure, that typically stores characters in a string and allows you to do really cool stuff with strings.

Now you have a dimension of the diversity of types of trees, beyond the canonical binary tree, and is worth mention that even though you can implement pointer edges for nodes referencing their parents be aware of space-time complexity tradeoffs.

Storing a tree, whatever type of tree it may be, is almost always going to be an `O(N)` space complexity where `N` is the total number of nodes in the tree.

If you're traversing through an entire tree, it's also would take `O(N)` time assuming you're not doing any auxiliary operations. But, sometimes, you're going to start at the top of the tree, and go down one specific branch, without interest in the other ones, when you find yourself in this situation you will have a time complexity of `O(log(N))`, because you go down the first node and when picking one path you eliminate half of the remaining nodes.

Trees could be **unbalanced**, which is the opposite of a _balanced tree_. We say that a tree is unbalanced when amount of nodes is not equally distributed between the subtrees, which means that either one of them is much deeper than the other one, and that's not the case for a balanced tree. Unbalanced trees not always will have `O(log(N))` time complexity. Advanced types of trees like _red-black trees_ or _AVL trees_ are constructed in such a way that they can rebalance themselves, just to keep `O(log(N))` time complexity. By now you should be able to recognize that the time complexity of `O(log(N))` is way better than `O(N)`.

Some more concepts before we end our lesson, we say that a tree is **complete** when all levels in the tree is filled up, except from the leaf nodes (the nodes on the bottom level). A _perfect tree_ is a data structure where all leaf-nodes have the same **depth**, depth refers to how far down a tree goes (all levels are complete).

## Resume

### Tree

A data structure that consists of nodes, each with some value and pointers to child-nodes, which recursively form **subtrees** in the tree.

The first node in a tree is referred to as the root of the tree, while the nodes at the bottom of a tree (the nodes with no child-nodes) are referred to as **leaf nodes** or simply **leaves**. The paths between the root of a tree and its leaves are called **branches**, and the **height** of a tree is the length of its longest branch. The **depth** of a tree node is its distance from its tree's root; this is also known as the node's **level** in the tree.

A tree is effectively a **graph** that's **connected**, **directed**, and **acyclic**, that has an explicit root node, and whose nodes all have a single **parent** (except for the root node, which effectively has no parent). Note that in most implementations of trees, tree nodes don't have a pointer to their parent, but they can if desired.

There are many types of trees and tree-like structures, including **binary trees**, **heaps**, and **tries**.

### Binary Tree

A **tree** whose nodes have up to **two** child-nodes.

The structure of a binary tree is such that many of its operations have a logarithmic time complexity, making the binary tree an incredibly attractive and commonly used data structure.

### K-ary Tree

A **tree** whose nodes have up to `k` child-nodes. A **binary tree** is a k-ary tree where **k == 2**.

### Perfect Binary Tree

A **binary tree** whose interior nodes all have two child-nodes and whose **leaf nodes** all have the same **depth**. Example:

<pre>           1
      /         \
     2           3
   /   \       /   \
  4     5     6     7
 / \   / \   / \   / \
8   9 10 11 12 13 14 15
</pre>

### Complete Binary Tree

A **binary tree** that's _almost_ **perfect**; its interior nodes all have two child-nodes, but its **leaf nodes** don't necessarily all have the same **depth**. Furthermore, the nodes in the **last level** of a complete binary tree are as far left as possible. Example:

<pre>          1
       /     \
      2       3
    /   \   /   \
   4     5 6     7
 /   \
8     9
</pre>

Conversely, the following binary tree _isn't_ complete, because the nodes in its last level aren't as far left as possible:

<pre>          1
       /     \
      2       3
    /   \   /   \
   4     5 6     7
         /   \
        8     9
</pre>

### Balanced Binary Tree

A **binary tree** whose nodes all have left and right **subtrees** whose heights differ by no more than 1.

A balanced binary tree is such that the logarithmic time complexity of its operations is maintained.

For example, inserting a node at the bottom of the following _imbalanced_ binary tree's left subtree would cleary not be a logarithmic-time operation, since it would involve traversing through most of the tree's nodes:

<pre>             1
          /     \
         2       3
       /
      4
    /
   8
  /
10
</pre>

The following is an example of a balanced binary tree:

<pre>          1
       /     \
      2       3
    /   \   /   \
   4     5 6     7
 /   \         /   
10    9       8
</pre>

### Full Binary Tree

A **binary tree** whose nodes all have either two child-nodes or zero child-nodes. Example:

<pre>    1
 /     \
2       3
      /   \
     6     7
   /   \
  8     9
</pre>