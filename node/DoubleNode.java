// 双向循环链表
// 概要： 与单项链表不同的是，双向列表除了一个指向下一个节点的变量之外，还有一个变量指向上一个节点。
// 当我们想要增加节点时，从相对位置而言，
// 当前节点的下一个节点成为下下个节点，而指定添加节点成为下一个节点。
// 指定添加节点的上一个节点为当前节点，原本的下一个节点的上一个节点成为指定添加节点

package node;

public class DoubleNode {
    // 节点内容
    int value;

    // 循环实现POINT 前一个节点
    DoubleNode preNode = this;

    // 循环实现POINT 后一个节点
    DoubleNode afterNode = this;

    // 构造函数
    public DoubleNode(int value){
        this.value = value;
    }

    // 添加节点
    public void addNode(DoubleNode doubleNode){
        DoubleNode currentNext = afterNode;
        this.afterNode = doubleNode;
        doubleNode.preNode = this;
        doubleNode.afterNode = currentNext;
        currentNext.preNode = doubleNode;
    }

    // 删除节点
    public void deleteNode(){
        DoubleNode pre = this.preNode;
        DoubleNode after = this.afterNode;
        pre.afterNode = after;
        after.preNode = pre;
    }

    // 上一个节点
    public DoubleNode getPre(){
        return preNode;
    }

    // 下一个节点
    public DoubleNode getAfter(){
        return afterNode;
    }

    // 获取数据
    public int getData(){
        return value;
    }
    
}