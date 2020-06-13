// Singly linked list 单链表

// 链表： 一个节点中存在当前节点值，以及下一个节点的引用
// 所以是无法根据当前节点去感知上一个节点，只能去感知下一个节点

// Java package name are all lower case
package node;

// The first letter of the class needs to be capitalized
public class Node {

   // Node content
    int value;

    // next node
    Node next;

    // Construction method
    public Node(int value){
        this.value = value;
    }

    // Get the next node
    public Node next(){
        return this.next;
    }

    // Get the value of the current node
    public int getData(){
        return this.value;
    }

    // Get all nodes of the current list
    public void show(){
        Node currentNode = this;
        do{
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }while(currentNode != null);
    }
    

    // Add the specified node to the end of the current list
    public Node addNode(Node value){
        // current node
        Node currentNode = this;
        while(true){
            if(currentNode.next == null) break;
            currentNode = currentNode.next;
        }
        currentNode.next = value;
        return this;
 
    }

    // Delete the next node of the current node
    public void deleteNode(){
        Node newNextNode = this.next.next;
        if (newNextNode != null){
            this.next = newNextNode;
        }
    }

    // Add a node after the specified node
    public void addSpecified(Node node){
        Node nextNode = this.next;
        this.next = node;
        node.next = nextNode;
    }

    // Determine whether the current node is the last node
    public boolean isLast(){
        return this.next == null;
    }


    
}