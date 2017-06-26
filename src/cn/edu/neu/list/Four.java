package cn.edu.neu.list;

import cn.edu.neu.list.test.DoubleNode;
import cn.edu.neu.list.test.SingleNode;

/**
 * 反转单项链表和双向链表
 * @author hasee
 *
 */
public class Four {
	
    public static  SingleNode reverseList(SingleNode head) {
    	SingleNode pre = null;
    	SingleNode next = null;
    	while (head != null) {
    		next = head.next;
    		head.next = pre;
    		pre = head;
    		head = next;
    	}
    	return head;
    }
    
    public static SingleNode reverseSingleNode(SingleNode head) {
    	SingleNode already = null;
    	SingleNode next = null;
    	while (head != null) {
    		next = head.next;
    		head.next = already;
    		already = head;
    		head = next;
    	}
    	return already;
    }
    
    public static SingleNode recursionSingleNode(SingleNode head) {
    	if (head == null || head.next == null) {
            return head;
    	}
    	SingleNode tmp = recursionSingleNode(head.next);
    	head.next.next = head;
    	head.next = null;
    	return tmp;
    }
////////////////////////////////////////////////////////////////////////////////
    /**
     * 双链表
     */
    public static DoubleNode reverseDoubleLink(DoubleNode head) {
    	DoubleNode next = null;
    	DoubleNode already = null;
    	while (head != null) {
    		next = head.right;
    		head.right = already;
    		head.left = next;
    		already = head;
    		head = next;
    	}
    	return already;
    }
    
    public static DoubleNode recursionDoubleLink(DoubleNode head) {
    	if (head == null || head.right == null) {
    		return head;
    	}
         
    	DoubleNode already = recursionDoubleLink(head.right);
    	head.right.right = head;
    	head.left = head.right;
    	head.right = null;
    	return already; 	
    }
    
}
