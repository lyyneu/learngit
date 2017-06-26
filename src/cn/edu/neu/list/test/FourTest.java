package cn.edu.neu.list.test;

import cn.edu.neu.list.Four;
import cn.edu.neu.list.ListUtil;

public class FourTest {
    public static void main(String args []) {
        DoubleNode head1 = ListCaseTest.getRandomDoubleNode(10, 10);
        testTwo(head1);
    }
    
    public static void test(SingleNode head) {
    	ListUtil.printSingleNode(head);
    	ListUtil.printSingleNode(Four.recursionSingleNode(head));
    }
    
    public static void testTwo(DoubleNode head) {
    	ListUtil.printDoubleNode(head);
    	ListUtil.printDoubleNode(Four.reverseDoubleLink(head));
    }
}
