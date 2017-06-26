package cn.edu.neu.list;

import cn.edu.neu.list.test.SingleNode;

/**
 * 打印两个有序链表的公共部分
 * @author hasee
 *
 */
public class One {
    
	/**
	 * 时间复杂度是 O(n)  空间复杂度是O(1)
	 * 该算法类似于归并排序中的归并处理
	 * @param head1
	 * @param head2
	 */
	public static void methodFirst(SingleNode head1, SingleNode head2) {
		while (head1 != null && head2 != null) {
			if (head1.value < head2.value) {
				head1 = head1.next;
			} else if (head1.value > head2.value) {
				head2 = head2.next;
			} else {
				System.out.print(head1.value+" ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
	}
}
