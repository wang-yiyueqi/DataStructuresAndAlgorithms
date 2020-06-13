package node.test;

import node.Node;

public class NodeTest {
    public static void main(String[] args) {
        // 新建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        // 将节点依次添加到当前链表的最后一位
        n1.addNode(n2);
        n1.addNode(n3).addNode(new Node(4));

        // 以header开始 获取节点
        // System.out.println(n1.next().getData());
        // System.out.println(n1.next().next().getData());

        // 查看当前链表信息
        n1.show();
        System.out.println();

        // // 删除当前链表的第二个节点的下一个节点 并再次查看链表信息
        // n1.next().deleteNode();
        // n1.show();

        // 新增节点
        n1.next().addSpecified(new Node(5));
        n1.show();
    }
    
}