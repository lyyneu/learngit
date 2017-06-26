package cn.edu.neu.list.test;

import cn.edu.neu.list.ListUtil;
import cn.edu.neu.list.One;

public class OneTest {
    public static void main(String[] args) {
		SingleNode head1 = ListCaseTest.getOrderSingleNode(20);
		SingleNode head2 = ListCaseTest.getOrderSingleNode(20);
		ListUtil.printSingleNode(head1);
		ListUtil.printSingleNode(head2);
		One.methodFirst(head1, head2);
	}
}
