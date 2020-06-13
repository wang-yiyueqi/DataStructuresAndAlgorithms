// 循环链表
// 因为是循环链表 所以不用判断当前节点是不是最后一个节点
// 也不用打印当前链表的所有信息

package node;

public class LoopNode {
    // 节点内容
    int value;

    // POINT 当当前链表只有一个节点时，这个节点的下一个节点是本身
    public LoopNode next = this;

    public LoopNode(int value){
        this.value = value;
    }

    // 获取现在的节点值
    public int getData(){
        return value;
    }

    // 获取下一个节点
    public LoopNode getNext(){
        return next;
    }
    

    // 将指定节点添加到现在的节点位置后
    public LoopNode addAfter(LoopNode loopNode){
        LoopNode nextNode = this.next;
        this.next = loopNode;
        loopNode.next = nextNode;
        return loopNode;
    }

    // 删除当前节点的下一个节点
    public void deleteNode(){
        LoopNode nextNode = next.next;
        next = nextNode;

    }

    
}