package node.test;

import node.LoopNode;

public class LoopNodeTest{
    public static void main(String[] args) {
        LoopNode lp1 = new LoopNode(1);
        LoopNode lp2 = new LoopNode(2);
        LoopNode lp3 = new LoopNode(3);
    
        lp1.addAfter(lp2).addAfter(lp2).addAfter(lp3).addAfter(new LoopNode(4));

        System.out.println(lp1.getNext().getData());
        // 如果next的访问修饰符是Public时， 可以通过变量名直接访问下一个节点
        // 否则只能向上一行一样，通过方法来进行访问
        System.out.println(lp2.next.getData());
        System.out.println(lp3.next.getData());
        System.out.println(lp3.next.getNext().getData());
        
    }


}