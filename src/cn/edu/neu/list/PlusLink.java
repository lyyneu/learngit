package cn.edu.neu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PlusLink {
     
	public static void main(String[] args) {
		Node a = new Node(9, null);
		Node b = new Node(8, a);
		Node c = new Node(2, b);
		
		Node d = new Node(0, null);
		Node e = new Node(9, d);
		
		Node result = plus(c, e);
		
		while (result != null) {
			System.out.print(result.value +" ");
			result = result.next;
		}
	}
	
	
	
	
	/**
	 * 思路：把链表中的数值用整形数字来表示，把两者相加，放到 valueResult中
	 * @param headFirst
	 * @param headSecond
	 * @return
	 */
	
	public static Node plus(Node headFirst, Node headSecond) {
		
		int valueFirst = 0;
		int valueSecond = 0;
		int valueResult = 0;
		Node tmpFirst = headFirst;
		Node tmpSecond = headSecond;
		Node result = headFirst;
		
		while (tmpFirst != null) {
			valueFirst *= 10;
			valueFirst += tmpFirst.value;
			tmpFirst = tmpFirst.next;
		}
		while (tmpSecond != null) {
			valueSecond *= 10;
			valueSecond += tmpSecond.value;
			tmpSecond = tmpSecond.next;
		}
		valueResult = valueFirst + valueSecond;
		// 这里可以优化 不需要用而外的空间来翻转数字，但我还没想到
		Stack<Integer> tmp = new Stack<Integer>();
		while (valueResult > 0) {
			tmp.push(valueResult % 10);
			valueResult = valueResult / 10;
		}
		int size = tmp.size();
		while (size > 0) {
			if (headFirst.next != null) {
				headFirst.value = tmp.pop();
				headFirst = headFirst.next;
				size--;
			} else {
				headFirst.value = tmp.pop();
				if (size > 2) {
				    headFirst.next = new Node(0,null);
				}
				headFirst = headFirst.next;
				size--;
			}
		}
	
		return result;
	}
}

class Node {
	
	int value;
	Node next;
	
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}