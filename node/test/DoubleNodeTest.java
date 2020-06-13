package node.test;

import node.DoubleNode;

public class DoubleNodeTest {
    public static void main(String[] args) {
        DoubleNode dn1 = new DoubleNode(1);
        DoubleNode dn2 = new DoubleNode(2);
        DoubleNode dn3 = new DoubleNode(3);

        // 添加节点到指定位置
        dn1.addNode(dn2);
        dn2.addNode(dn3);
        dn3.addNode(new DoubleNode(4));

        // 获取节点的前后节点信息
        System.out.println(dn2.getPre().getData());
        System.out.println(dn2.getData());
        System.out.println(dn2.getAfter().getData());
        System.out.println(dn2.getAfter().getAfter().getData());

        System.out.println("--------------");

        //删除节点
        dn2.deleteNode();

        System.out.println(dn1.getPre().getData());
        // System.out.println(dn2.getPre().getData());
        System.out.println(dn3.getPre().getData());
        System.out.println(dn1.getPre().getPre().getData());

    }
    
}