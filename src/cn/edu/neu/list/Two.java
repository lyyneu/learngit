package cn.edu.neu.list;

import cn.edu.neu.list.test.DoubleNode;
import cn.edu.neu.list.test.SingleNode;

/**
 * 在单链表和双链表中删除倒数第k个节点
 * @author hasee
 *
 */
public class Two {
    
    public static SingleNode single(SingleNode head, int k) {
        int size = ListUtil.getSingleNodeSize(head);
        int move = size - k - 1;
        SingleNode tmp = head;
        if (move < 1) {
        	return head;
        }
        while(move > 0) {
        	tmp = tmp.next;
        	move--;
        }
        SingleNode node = tmp.next;
        tmp.next = node.next;
        return head; 
    }
    
    // 双向环
    public static DoubleNode doubleCase(DoubleNode head, int k) {
        DoubleNode tmp = head;
        int move = k - 1;
        while (move > 0) {
        	tmp = tmp.left;
        	move--;
        }
        if (tmp != null && tmp.left != null) {
        	DoubleNode remove = tmp.left;
        	DoubleNode next = remove.left;
        	tmp.left = next;
        	next.right = tmp;
            return head;
        } else {
        	return head;
        }
    }
    
    // 双向无环
    
    public static DoubleNode doubleCaseTwo(DoubleNode head, int k) {
    	int size = ListUtil.getDoubleNodeSize(head);
    	int move = size - k - 1;
    	DoubleNode tmp = head;
    	if (move < 1) {
    		return head;
    	} 
    	while (move > 0) {
    		tmp = tmp.right;
    		move--;
    	}
    	if (tmp.right != null) {
    		DoubleNode remove = tmp.right;
    		DoubleNode right = remove.right;
    		tmp.right = right;
    		right.left = tmp;
    	}
    	return head;
    }
}
