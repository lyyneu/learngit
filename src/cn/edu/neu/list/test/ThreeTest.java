package cn.edu.neu.list.test;

import cn.edu.neu.list.ListUtil;
import cn.edu.neu.list.Three;

public class ThreeTest {
    
	public static void main(String[] args) {
		
		SingleNode head1 = ListCaseTest.getRandomSingleNode(1, 10);
		SingleNode head2 = ListCaseTest.getRandomSingleNode(2, 10);
		SingleNode head3 = ListCaseTest.getRandomSingleNode(3, 10);
		SingleNode head11 = ListCaseTest.getRandomSingleNode(12, 10);
		
        test(head1);
        test(head2);
        test(head3);
        test(head11);
		
	}
    
    public static void test(SingleNode head) {
		ListUtil.printSingleNode(head);
		ListUtil.printSingleNode(Three.removeMiddle(head));
    }
}
