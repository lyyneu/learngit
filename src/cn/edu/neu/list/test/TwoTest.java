package cn.edu.neu.list.test;

import cn.edu.neu.list.ListUtil;
import cn.edu.neu.list.Two;

public class TwoTest {
    public static void main(String[] args) {
		SingleNode head1 = ListCaseTest.getRandomSingleNode(20, 50);
		ListUtil.printSingleNode(head1);
		Two.single(head1, 5);
		ListUtil.printSingleNode(head1);
		
		DoubleNode head = ListCaseTest.getRandomDoubleNode(20, 50);
		ListUtil.printDoubleNode(head);
		Two.doubleCaseTwo(head, 5);
		ListUtil.printDoubleNode(head);
	}
}
