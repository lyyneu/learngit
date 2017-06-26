package cn.edu.neu.list;

public class ListPartition {
    
	
	public Node listPartition (Node head, int pivot) {
		if (head == null) {
			return head;
		}
		Node cur = head;
		int size = 0;
		while (cur != null) {
			size++;
			cur = cur.next;
		}
		Node[] nodeArr = new Node[size];
		size = 0;
		cur = head;
		for (size = 0; size < nodeArr.length; size++) {
			nodeArr[size] = cur;
			cur = cur.next;
		}
		arrPartition(nodeArr, pivot);
		for (size = 1; size != nodeArr.length; size++)  {
			nodeArr[size - 1].next = nodeArr[size];
		}
		nodeArr[size - 1].next = null;
		return nodeArr[0];		
	}
	
	public void arrPartition (Node[] nodeArr, int pivot) {
		int small = -1;
		int big = nodeArr.length;
		int index = 0;
		while (index != big) {
			if (nodeArr[index].value < pivot) {
				swap(nodeArr, ++small, index++);
			} else if (nodeArr[index].value == pivot){
				index++;
			} else {
				swap(nodeArr, --big, index);
			}
		}
	}
	
	public void swap(Node[] nodeArr, int a,int b) {
		Node tmp = nodeArr[a];
		nodeArr[a] = nodeArr[b];
		nodeArr[b] = tmp;
	}
///////////////////////////////////////////////////////////////////////////////////
	
}





