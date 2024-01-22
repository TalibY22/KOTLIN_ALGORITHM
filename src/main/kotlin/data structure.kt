class BinaryTreeNode<T>(val value: T) {
    var left: BinaryTreeNode<T>? = null
    var right: BinaryTreeNode<T>? = null
}

fun main() {
    // Creating a simple binary tree
    val rootNode = BinaryTreeNode(1)

    val leftChild = BinaryTreeNode(5)
    val rightChild = BinaryTreeNode(3)

    val leftGrandchild = BinaryTreeNode(4)
    val rightGrandchild = BinaryTreeNode(6)

    rootNode.left = leftChild
    rootNode.right = rightChild

    leftChild.left = leftGrandchild
    rightChild.right = rightGrandchild

    // Traversing the binary tree
    println("In-order traversal:")
    inOrderTraversal(rootNode)

    println("pre-order traversal:")
    preOrderTraversal(rootNode)

    println("post-order traversal:")
    postOrderTraversal(rootNode)

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