# Binary Search Tree | Ternary Search Tree | Exponential Tree 🌳

## Our aim 🎯
Our aim of final project is to show diferences between these data structures and 
dig deeper and learn more about Exponential Trees. 

These data structures have similarities. However, Exponential Tree have some unique qualities. This uniqueness its dimension. In an exponential tree, the dimension equals the depth of the node, with the root node having a d = 1. So the second level can hold four nodes. And it will increase by 2 at each level.

## Idea of implementation 💡
Our idea of implementaion is having ArrayList of Nodes. So, every time it creates new node, algorithm should send current level. Based on the current level we set the size how many children can it store. 

## Comparisons of Big-O notations of data structures 📈
#### Binary Search Tree
* Search - O(n)
* Insert - O(n)
* Delete - O(n)

**Ternary Search Tree**
* Search - O(n)
* Insert - O(n)
* Delete - O(n)

**Exponential Tree**
* Search - O(min(√log n, log n/log w+ log log n, log w log log n))
* Insert - O(min(√log n, log n/log w+ log log n, log w log log n))
* Delete - O(min(√log n, log n/log w+ log log n, log w log log n))

>All data was taken from [wikipedia](https://en.wikipedia.org/wiki/Exponential_tree)

## Future Plans 🗓️
Our future plans is to integrate this algorithm to mobile development and develop really cool stuff.

>The project not finished yet.

