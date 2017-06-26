

public class TreeTest {
    public static void main(String args []) {
    	
    	Tree  tree = new Tree();
    	Tree.Node D = tree.new Node("D",null,null);
    	Tree.Node E = tree.new Node("E",null,null);
    	Tree.Node B = tree.new Node("B",D,E);
    	Tree.Node N = tree.new Node("N",null,null);
    	Tree.Node G = tree.new Node("G",null,null);
    	Tree.Node C = tree.new Node("C",N,G);
    	Tree.Node A = tree.new Node("A",B,C);
    	
    	tree.precede(A);
    	System.out.println();
    	tree.inorder(A);
    	System.out.println();
    	tree.postOrder(A);
    }
}
