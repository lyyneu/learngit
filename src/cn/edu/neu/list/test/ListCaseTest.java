package cn.edu.neu.list.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import cn.edu.neu.list.ListCase;

public class ListCaseTest {
    
	/**
	 * 获取有序单链表
	 * @param n  生成有序单链表的大小
	 * @return   头结点
	 */
	public static SingleNode getOrderSingleNode(int n) {
		Random random = new Random();
		int sum = random.nextInt(10);
		SingleNode result = new SingleNode(sum, null);
		SingleNode tmp = result;
		for (int i = 1; i < n; i++) {
			sum += random.nextInt(5);
			tmp.next = new SingleNode(sum, null);
			tmp = tmp.next;
		}
		return result;
	}
	
    /**
     * 获取值是随机生成的单链表
     * @param size  生成单链表的大小
     * @param scope 随机生成值的范围
     * @return      返回链表的头结点
     */
	public static SingleNode getRandomSingleNode(int size, int scope) {
		Random random = new Random();
		SingleNode result = new SingleNode(random.nextInt(scope), null);
	    SingleNode tmp = result;	
		for (int i = 0; i < size - 1; i++) {
			tmp.next = new SingleNode(random.nextInt(size), null);
			tmp = tmp.next;
		}
		return result;
	}
    
	/**
	 * 获取值是随机生成的环形单链表
	 * @param size  生成单链表的大小
	 * @param scope 随机生成值的范围
	 * @return      返回环形单链表的头结点
	 */
	public static SingleNode getRandomCircleSingleNode(int size, int scope) {
		Random random = new Random();
		SingleNode result = new SingleNode(random.nextInt(scope), null);
	    SingleNode tmp = result;	
		for (int i = 0; i < size; i++) {
			tmp.next = new SingleNode(random.nextInt(size), null);
			tmp = tmp.next;
		}
		tmp.next = result;
		return result;		
	}

	/**
	 * 生成有序的双向链表
	 * @param size 链表结点的大小，链表值的范围
	 * @return 返回双向链表头结点
	 */
    public static DoubleNode getOrderDoubleNode(int size) {
    	DoubleNode result = new DoubleNode(1, null, null);
    	DoubleNode tmp = result;
    	for (int i = 1; i < size; i++) {
    		tmp.right = new DoubleNode(i+1, tmp, null);
    		tmp = tmp.right;
    	}
    	return result;
    }
    
    /**
     * 生成无序值的双向链表
     * @param size  链表节点的大小
     * @param scope 链表值的范围
     * @return 返回链表的头结点
     */
    public static DoubleNode getRandomDoubleNode(int size, int scope) {
    	Random random = new Random();
    	DoubleNode result = new DoubleNode(random.nextInt(scope), null, null);
    	DoubleNode tmp = result;
    	for (int i = 1; i < size; i++) {
    	    tmp.right = new DoubleNode(random.nextInt(scope), tmp, null);
    	    tmp = tmp.right;
    	}
    	return result;
}

}
