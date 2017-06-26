package cn.edu.neu.list;

import cn.edu.neu.list.test.SingleNode;

/**
 * 删除链表的中间节点和 a/b处的节点
 * @author hasee
 *
 */
public class Three {
    public static SingleNode removeMiddle(SingleNode head) {
    	int size = ListUtil.getSingleNodeSize(head);
    	SingleNode tmp = head;
    	if (size <= 1) {
    		return head;
    	}
    	int move = (size + 1) / 2 - 2 ;
    	if (move == -1) {
    		head = tmp.next;
    		return head;
    	} 
    	while (move > 0) {
    		tmp = tmp.next;
    		move--;
    	}
    	if (tmp != null && tmp.next != null) {
    		SingleNode remove = tmp.next;
    		tmp.next = remove.next;
    	}
    	return head;
    }
    
    public static SingleNode removeIndex(SingleNode head, int a, int b) {	
    	int move = a / b;
    	SingleNode tmp = head;
    	int k = 0;
    	if (move == 0) {
    		return head;
    	}
    	if (move > 0 && move <= 1/5) {
            head = tmp.next;
            return head;
    	}
    	if (move > 1/5 && move <= 2/5) {
    	    tmp.next = tmp.next.next;
    	    return head;
    	}
    	if (move > 2/5 && move <= 3/5) {
    		k = 1;
    		while (k > 0) {
    			tmp = tmp.next;
    			k--;
    		}
    		if (tmp == null || tmp.next == null) {
    			return head;
    		}
    		tmp.next = tmp.next.next;
    		return head;
    	}
    	if (move > 3/5 && move <= 4/5) {
    		k = 2;
    		while (k > 0) {
    			tmp = tmp.next;
    			k--;
    		}
    		if (tmp == null || tmp.next == null) {
    			return head;
    		}
    		tmp.next = tmp.next.next;
    		return head;
    	}
    	if (move > 4/5 && move <= 1) {
    		k = 3;
    		while (k > 0) {
    			tmp = tmp.next;
    			k--;
    		}
    		if (tmp == null || tmp.next == null) {
    			return head;
    		}
    		tmp.next = tmp.next.next;
    		return head;
    	}
    
    	return head;
    }
}
