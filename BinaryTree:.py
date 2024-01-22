class BinaryTree:
    def __init__(self,value):
        self.value = value
        self.right = None
        self.left = None
    









def in_order(Node):
    if Node != None:
        in_order(Node.left)
        print(Node.value)
        in_order(Node.right)


def pre_order(Node):
    if Node is not None:
        print(Node.value)
        pre_order(Node.left)
        pre_order(Node.right)
        

def post_order(Node):
    if Node is not None:
        post_order(Node.left)
        post_order(Node.right)
        print(Node.value)


root_node = BinaryTree(12)

left_child = BinaryTree(10)
right_child = BinaryTree(20)

left_grandchild = BinaryTree(30)
right_grandchild = BinaryTree(22)

root_node.left = left_child
root_node.right=right_child

left_child.left = left_grandchild
right_child.right=right_grandchild


recursion()