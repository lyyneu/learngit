
public class Tree {
    Node root;
    public void precede(Node root) {
    	
    	if (root == null) {
    		return;
    	}
    	
    	System.out.print(root.value + " ");
    	precede(root.left);
    	precede(root.right);
    }
    
    public void inorder(Node root) {
    	
    	if (root == null) {
    		return;
    	}
    	
    	inorder(root.left);
    	System.out.print(root.value + " ");
    	inorder(root.right);
    }
	
	public void postOrder(Node root) {
		
		if (root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value + " ");
	}
	
    class Node {
      
    	String value;
		Node left;
		Node right;
		
		public Node(String value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
}
