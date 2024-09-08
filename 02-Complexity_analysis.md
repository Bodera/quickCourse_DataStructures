# Complexity Analysis

Just as data structures are the foundational knowledge that you need ti tackle coding interview problems, complexity analysis is the foundational knowledge that you need to better understand data structures, and in turn, complexity analysis is sort of like the bedrock of coding interview problems.

Let's take a step back and think a moment, when you're dealing with a coding interview problem it's very common for a single problem to have multiple solutions, as illustrated bellow.

![One problem has N solutions](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Freach.scot%2Fwp-content%2Fuploads%2F2017%2F12%2Fproblem-solution.jpg&f=1&nofb=1&ipt=651e72d8a03e2188d34fbfa7b6d6fad1d863eac1699bc9f3e5b6b3af6cfd6e59&ipo=images)

The trick question is, are all these solutions equal? I mean are they all just as good as each other? It turns out they're not, some solutions are better than others. When facing a coding interview, you'll likely find yourself in the position where you found an answer, maybe you've even coded it out, and the interviewer's going to ask you the notorious question: can you do better? And of course this begs the question: what is considered better? Or, what makes one solution better than another? And this is where complexity comes into play.

What makes one solution better than another is whether it has a better complexity. So what complexity mean? See, when we say complexity, we're not referring to a solutions difficulty or complicatedness, granted, if a solution is needlessly complicated, that might make it worse than another solution but that's not a really reliable metric that we're going to be looking at when comparing multiple solutions.

When we talk about complexity here, we're referring to a very specific computer science concept, which can be further divided into two other concepts: **time complexity** and **space complexity**. We often refer to both of them together as space-time complexity.

Let's start with a very high level overview of these new concepts introduced here at a big picture level, time complexity is really just a measure of how fast an algorithm, or a solution to a coding interview problem, runs, and space complexity is just a measure of how much memory, or space, an algorithm uses up. So the faster an algorithm runs the better it's time complexity is and therefore the better the algorithm is. Similarly, the less memory an algorithm takes, the better it's space complexity is and therefore the better the algorithm is.

Going back to the solutions of our problem, let's say **solution #1** compared to **solution #2**, the better solution will be the one that has a better time complexity or a better space complexity. Now mind you sometimes one solution will have maybe a better time complexity compared to another, but it has a worse space complexity, and here there isn't a clear answer on which solution is better, it's going to depend on the use case of that solution, the use case of the algorithm, but the point is when you're comparing two solutions and trying to figure out which is better, you're really comparing their space-time complexities, and for sure when we say complexity analysis, we really just mean figuring out what the complexity of an algorithm or the solution is, that's really all the word analysis means.

Let's wrap this lesson tying the concept of complexity analysis back to data structures because we said that it's the foundational knowledge that you need to better understand data structures. Recall from previous lesson where we've defined data structures as sets of data values, the relationship between these values, and the set of operations and functions that you can apply on these values. It turns out that these operations or functions have time complexity and space complexity ramifications, in other words, to perform an operation or a function on a give data structure or rather on the underlying set of data values, either is going to take time or memory. And similarly the relationship between the data values and a data structure has time and space complexity ramifications.

Keep in mind that there are a lot of data structures that look different and have different relationships between the data values and what that means is that each data structures has their particular space-time complexity ramifications for the functions and operations that they support. And the key thing for you when you're going to deak with a coding interview problem is not only figuring out what data structure best allows you to solve the problem, but also what data structure allows you to do so with the best space-time complexity. This means you're going to need to be very familiar with all the space-time complexity ramifications of the various popular data structures.

## Resume 

### Complexity Analysis

The process of determining how efficient an algorithm is. Complexity analysis usually involves finding both the <b>time complexity</b> and the <b>space complexity</b> of an algorithm.

It is effectively used to determine how "good" an algorithm is and whether it's "better" than another one.

### Time Complexity

A measure of how fast an algorithm runs, time complexity is a central concept in the field of algorithms and in coding interviews.

It's expressed using <b>Big O</b> notation.


### Space Complexity

A measure of how much auxiliary memory an algorithm takes up, space complexity is a central concept in the field of algorithms and in coding interviews.

It's expressed using <b>Big O</b> notation.