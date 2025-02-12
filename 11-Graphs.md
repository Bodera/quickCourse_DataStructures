# Graphs

Graphs are actually pretty simple, especially in the context of coding interviews. As you'll soon see, graphs pop up in everyday life all the time. You've certainly interacted with real life examples of graphs many times in your life.

Let's start by defining what a graph is. Simply put, a graph is a collection of nodes that may or may not be connected to one another. Recall from previous lessons that we referred to elements in certain data structures like linked lists, for instance, we called elements nodes, here is the same thing, elements in a graph are called nodes.

Nodes are linked to each other by arrows representing the connections in between these nodes. That's what a graph is at its core, a collection of nodes that may or may not be connected to one another.

We actually give a name to the nodes, and the connections in a graph. Nodes are named as vertices, so every node is a **vertex** in the graph, and we call the connections (those arrows) as **edges**. So a graph is really made up of two special things, vertices and edges. The vertices are just nodes that might have values, and the edges are connections, things that connects nodes to one another.

Now, there are a lot of different types of graphs, and to be honest I don't think that it's a good idea to try to memorize all the different types of graphs that exist, or all the different names for graphs. I think the best way to approach graphs is to really ask yourself, what are the key things, or concepts, or properties, that I notice to be important, or glaring, when I look at a graph? So for instance, it may happen that not every vertex are connected with each other, in some cases there will be nodes that are disconnected from the graph meaning that this kind of graph is not connected, this is an important concept in graphs, whether a graph is connected or not. We say that a graph is connected if basically you can reach any other node in the graph from another node or rather if there is some path between any two nodes in the graph. A real life example of a graph structure with disconnected nodes, could be locations around some geographic region, where the arrows represent transportation channels.

The second thing to notice when looking at a graph structure e how the edges are represented on it. When using arrows, we're implying directions.

```javascript
A--->B
```

The representation above denotes that we can only get to vertex B from vertex A, but we can't get to vertex A from vertex B. There is only one direction that the arrow goes in.

```javascript
F<--->G
```

The representation above denotes that we can get to vertex G from vertex F and vice versa. This is a very important concept in graph theory, the idea that some graphs are directed, meaning the edges in those graphs have a direction.

An undirected graph would have no directions, like this:

```javascript
X---Y
```

That means that there's a connection between nodes X and Y, but not in one direction.

Perhaps, the best way to conceptualize the difference between a directed graph and an undirected graph is to think of real world examples.

When we're talking about a directed graph you might imagine flights. If you have flights, they go from one airport to another airport, that would be a directed connection. On the other hand, let's think of friendships, the kind of Facebook friendships. If you are friends with someone on Facebook, then naturally, by the definition of a Facebook friendship, that person is friends with you, so if they are your friend you are their friend, in this case an undirected graph might make more sense because there is no direction of the friendship, it is a mutual connection.

The third and final concept that's very important is the concept of **cycles**. A graph can have what are called cycles in it, and if a graph has a cycle we call it a cyclic graph, if it doesn't have any cycles we call it an acyclic graph.

Not the definition of a cycle can be very complex if you look it up online, you'll see a very mathematical definition for it, but the far simpler way to think about what a cycle is, is just imagine if at any point in the graph, at any area in the graph, you have three or more nodes or vertices that kind go in an infinite loop - then you have a cycle.

If you're traversing through your graph, and you're kind of going down connections, and find yourself revisiting a connection that you've previously visited just by following a path of three edges, then that means that there's a cycle in the graph. 

Cycles pop up a lot in tons of the different graphs. As an example, let's say you're on Wikipedia, and on Wikipedia you know that there are links that link to other Wikipedia pages, and there can be tons of links on a given page. Sometimes, you might follow links and eventually arrive back to the original page that you were on. For instance, you might be on the Wikipedia page for graphs, on that page you might find a link to data structures, on that you might find a link to complexity analysis, and on that page you might find a link that goes back to graphs. That's precisely an example of a cyclic graph - the Wikipedia linking system.

Also in the context of coding interviews, if you are dealing with a cyclic graph, or if you're dealing with a graph that could be cyclic, you want to make sure that you don't find yourself writing an algorithm that is going to end up in an infinite loop like this one here. So you can avoid that by using certain techniques, like maybe marking nodes that you're already visited as `visited` and then skipping it if you revisit it, but the point is, cyclic graphs are something that you have to look out for in coding interviews.

So **connectivity**, **direction** and **cycles**, are three very important concepts in graphs, and you have to know or be aware of when you're entering a coding interview. And the thing that's really cool about graphs, is that there is so many applications where they could be applied for, so it's important for you to be able to recognize when you can actually transform a certain input or certain problem into a graph problem.

Now as far as representing a graph in code, we typically represent a graph as what's called an _adjacency list_. The idea is that you can store a list of nodes in the graph, or a hash table where every key in this hash table is the value of each node and every key points to the relevant node, and then every node stores a list of its edges or rather, a list of its adjacencies - hence the word adjacency list.

Representing a graph in code is actually very easy, again, you're typically just going to store a list of nodes, or hash tables of nodes, where each node has a value, and each node has a list of edges. You can certainly think that these edges are basically pointers under the hood. You're just pointing to the nodes that you're connected to.

As far as space complexity is concerned, when you're creating a graph, representing a graph in code, what you will be storing? You're going to be storing `V` vertices or nodes, where `V` is the number of vertices in the graph, and then for all the nodes you're going to store their edges, a total of `E` edges, where `E` is the number of edges, so we say that the space complexity of the storing a graph in code is `O(V+E)`.

Then, perhaps the most common operation that you'll find yourself performing on a graph is traversing it, and there are two traversal methods for graphs, one of them is called _depth first search_, the other is called _breadth first search_.

They are extremely important to know well and here we're just gloss over them. Basically, at a glance, if you're performing a depth first search traversal the idea is that you are traversing the graph deeper first by visiting all child nodes before moving on to the neighbor nodes, you go deep first and then wide. With breadth first search you actually go wider before you go deep by visiting all the neighbors first before moving on to the child nodes.

Now, are you curious about the time complexity to traverse a graph? Whether you're using depth first search or breadth first search, the time complexity for traversing a graph is `O(V+E)`, where `V` is the number of vertices in the graph and `E` is the number of edges in the graph, that's because you will be traversing every single vertex and for every single vertex you'll be traversing through all the edges.

There are a few other operations that you can perform on graphs, like maybe adding edges, adding vertices, removing edges, removing vertices, but typically those operations are going to be very specific to the problem at hand, so there is no point to try to cover them here.

## Resume

A graph is a collection of nodes or values called vertices that might be related; relations between vertices are called edges.

Many things in life can be represented by graphs; for example, a social network can be represented by a graph whose vertices are users and whose edges are friendships between the users. Similarly, a city map can be represented by a graph whose vertices are locations in the city and whose edges are roads between the locations.

### Graph Cycle

Simply put, a cycle occurs in a graph when three or more vertices in the graph are connected so as to form a closed loop.

Note that the definition of a graph cycle is sometimes broadened to include cycles of length two or one; in the context of coding interviews, when dealing with questions that involve graph cycles, it's important to clarify what exactly constitutes a cycle.

### Acyclic Graph

A graph that has no cycles.

### Cyclic Graph

A graph that has at least one cycle.

### Directed Graph

A graph whose edges are directed, meaning that they can only be traversed in one direction, which is specified.

For example, a graph of airports and flights would likely be directed, since a flight specifically goes from one airport to another (i.e., it has a direction), without necessarily implying the presence of a flight in the opposite direction.

### Undirected Graph

A graph whose edges are undirected, meaning that they can be traversed in both directions.

For example, a graph of friends would likely be undirected, since a friendship is, by nature, bidirectional.

### Connected Graph

A graph is connected if for every pair of vertices in the graph, there's a path of one or more edges connecting the given vertices.

In the case of a directed graph, the graph is:

- **strongly connected** if there are bidirectional connections between the vertices of every pair of vertices (i.e., for every vertex-pair `(u, v)` you can reach `v` from `u` and `u` from `v`)
- **weakly connected** if there are connections (but not necessarily bidirectional ones) between the vertices of every pair of vertices

A graph that isn't connected is said to be **disconnected**.
