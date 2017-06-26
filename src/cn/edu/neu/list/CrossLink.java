package cn.edu.neu.list;
/**
 * 思路：分类讨论， 第一种情况： 两个链表都是单链表
 *                第二种情况： 一个链表是单链表，一个链表是环链表。
 *                第三种情况： 都是环 ，不可能。
 * ① 求出 两个链表的长度 N,M.   
 * ② 假设 N > M  :  size = N - M; 如果 M > N :同理求出他们长度的步长。  
 * ③ 判断这个两个链表的形状
 * ④ 满足第一种情况：长的链表先走size 步，后边两个链表同时走，每走一步都进行判断是否相等，相等则返回。
 *   满足第二种情况：长的先走size 步就不走了，短的从头开始走，每走一步就判断一次。
 * @author hasee
 *
 */
public class CrossLink {
    
	public Node cross(Node headFirst, Node headSecond) {
		
		int firstSize = getSize(headFirst);
		int secondSize = getSize(headSecond);
		Object a; 
		
		return null;
	}
	
	public int getSize(Node node) {
		int size = 0;
	    while (node != null) {
	    	node = node.next;
	    	size ++;
	    }
	    return size;
	}
	
	public boolean checkLoop(Node node) {
        
	}
}
