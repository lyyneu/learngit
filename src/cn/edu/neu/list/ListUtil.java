package cn.edu.neu.list;

import cn.edu.neu.list.test.DoubleNode;
import cn.edu.neu.list.test.SingleNode;

public class ListUtil {
    
	public static int getSingleNodeSize(SingleNode head) {
		int size = 0;
		SingleNode tmp = head;
		while (tmp != null) {
			tmp = tmp.next;
			size ++;
		}
		return size;
	}
	
	public static int getDoubleNodeSize(DoubleNode head) {
		int size = 0;
		DoubleNode tmp = head;
		while (tmp != null) {
			tmp = tmp.right;
			size++;
		}
		return size;
	}
	
	public static void printSingleNode(SingleNode head) {
		SingleNode tmp = head;
		while (tmp != null) {
			System.out.print(tmp.value+" ");
			tmp = tmp.next;
		}
		System.out.println();
	}
	
	public static void printDoubleNode(DoubleNode head) {
		DoubleNode tmp = head;
		while (tmp != null) {
			System.out.print(tmp.value+ " ");
			tmp = tmp.right;
		}
		System.out.println();
	}
}
