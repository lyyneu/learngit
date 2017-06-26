package cn.edu.neu.list;

import java.util.Iterator;
import java.util.List;

public class ListCase {
    
	/**
	 * 输入有序链表 one, two ;
	 * 输出他们公共的部分
	 * @param one
	 * @param two
	 */
	public void findCommentValue(List<Integer> one, List<Integer> two) {
	    Iterator<Integer> iterOne = one.iterator();    
	    Iterator<Integer> iterTwo = two.iterator();
	    Integer a = iterOne.next();
        Integer b = iterTwo.next();
	    while (a != null && b != null) {
	    	if (a < b) {
	    		a = iterOne.next();
	    	} else if (a > b) {
	    		b = iterTwo.next();
	    	} else {
	    		System.out.println(a);
	    		a = iterOne.next();
	    		b = iterTwo.next();
	    	}
	    }
	}
}
