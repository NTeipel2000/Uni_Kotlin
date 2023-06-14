 sealed class Tree {
    abstract fun size(): Int
    abstract fun amountOfLongSongs(): Int
}

 class TreeNode(val value: Song, val left: Tree = EmptyTreeNode(), val right: Tree = EmptyTreeNode()): Tree() {
     override fun size(): Int = left.size() + right.size() + 1

     override fun amountOfLongSongs(): Int {
         return if(value.duration > 180) 1 + left.amountOfLongSongs() + right.amountOfLongSongs()
         else left.amountOfLongSongs() + right.amountOfLongSongs()
     }

 }

 class EmptyTreeNode(): Tree() {
     override fun size(): Int = 0
     override fun amountOfLongSongs(): Int = 0
 }

