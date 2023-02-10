class Node<T> {
    final T value
    Node<T> next
    Node<T> prev
    
    Node(T value) {
        this.value = value
    }
}

class DoubleLinkedList<T> {
   
    private Node<T> headNode
    private Node<T> tailNode

    void push(T value) {
        def node = new Node(value)
        if (tailNode) {
            node.prev = tailNode
            tailNode.next = node
        }
        else {
            headNode = node
        }
        tailNode = node
    }

    T pop() {
        if (tailNode) {
            def node = tailNode
            if (node.prev) {
                node.prev.next = null
                tailNode = node.prev
            }
            else {
                headNode = null
                tailNode = null
            }
            node.value
        }
    }

    T shift() {
        if (headNode) {
            def node = headNode
            if (node.next) {
                node.next.prev = null
                headNode = node.next
            }
            else {
                headNode = null
                tailNode = null
            }
            node.value
        }
    }
    
    void unshift(T value) {
        def node = new Node(value)
        if (headNode) {
            node.next = headNode
            headNode.prev = node
        }
        else {
            tailNode = node
        }
        headNodeNode = node
    }
    
}
