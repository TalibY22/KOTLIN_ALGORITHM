class BinaryTreeNode<T>(val value: T) {

    var left: BinaryTreeNode<T>? = null
    var right: BinaryTreeNode<T>? = null
}

    fun <T : Comparable<T>> insert(node: BinaryTreeNode<T>?, value: T): BinaryTreeNode<T> {
        if (node == null) {
            return BinaryTreeNode(value)


        }
        //if the value is less that the root node insert on the left
        if (value < node.value) {
            node.left = insert(node.left, value)
            //else if the value is greater that the node insert on the right
        } else if (value > node.value) {
            node.right = insert(node.right, value)
        }

        return node
    }


    fun bst_tree() {
        var rootnode: BinaryTreeNode<Int>? = null
        rootnode = insert(rootnode, 20)
        insert(rootnode, 10)
        insert(rootnode, 30)
        inOrderTraversal(rootnode)
    }




fun main() {
    // Creating a simple binary tree
   val algorithms = algorithms()
    var rootnode: BinaryTreeNode<Int>? = null
    rootnode = insert(rootnode, 20)
    insert(rootnode, 10)
    insert(rootnode, 30)
    print( algorithms.addBT(rootnode))





}

fun <T> inOrderTraversal(node: BinaryTreeNode<T>?) {
    if (node != null) {
        inOrderTraversal(node.left)
        print("${node.value} ")
        inOrderTraversal(node.right)
    }
}

fun <T> preOrderTraversal(node: BinaryTreeNode<T>?) {
    if (node != null) {
        print("${node.value} ")
        preOrderTraversal(node.left)
        preOrderTraversal(node.right)
    }
}

fun <T> postOrderTraversal(node: BinaryTreeNode<T>?) {
    if (node != null) {
        postOrderTraversal(node.left)
        postOrderTraversal(node.right)
        print("${node.value} ")
    }
}