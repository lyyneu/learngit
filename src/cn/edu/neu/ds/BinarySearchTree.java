package cn.edu.neu.ds;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Random;

import cn.edu.neu.ds.interface_.ITree;

public class BinarySearchTree<T extends Comparable<T>> implements ITree{
    
	private int modifications = 0;
	protected static final Random RANDOM = new Random();
	
	protected Node<T> root = null;
	protected int size = 0;
	protected INodeCreator<T> creator = null;
	
	
	
	@Override
	public boolean add(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection toCollection() {
		// TODO Auto-generated method stub
		return null;
	}
	

    protected static class Node<T extends Comparable<T>> {

        protected T id = null;
        protected Node<T> parent = null;
        protected Node<T> lesser = null;
        protected Node<T> greater = null;

        /**
         * Node constructor.
         * 
         * @param parent
         *            Parent link in tree. parent can be NULL.
         * @param id
         *            T representing the node in the tree.
         */
        protected Node(Node<T> parent, T id) {
            this.parent = parent;
            this.id = id;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            return "id=" + id + " parent=" + ((parent != null) ? parent.id : "NULL") + " lesser="
                    + ((lesser != null) ? lesser.id : "NULL") + " greater=" + ((greater != null) ? greater.id : "NULL");
        }
    }

    protected static interface INodeCreator<T extends Comparable<T>> {

        /**
         * Create a new Node with the following parameters.
         * 
         * @param parent
         *            of this node.
         * @param id
         *            of this node.
         * @return new Node
         */
        public Node<T> createNewNode(Node<T> parent, T id);
    }
	
	protected static class TreePrinter {
       
	  
	}
	
    private static class JavaCompatibleBinarySearchTree<T extends Comparable<T>> extends java.util.AbstractCollection<T> {
       
    	protected BinarySearchTree<T> tree = null;
    	
        public JavaCompatibleBinarySearchTree(BinarySearchTree tree) {
		    this.tree = tree;
		}
        
        public boolean add(T value) {
        	return tree.add(value);
        }
        
        public boolean remove(Object value) {
        	return (tree.remove((T)value) != null);
        }
        
        public boolean contains(Object value) {
            return tree.contains((T)value);  	
        }
		@Override
		public Iterator<T> iterator() {
			
			return (new BinarySearchTreeIterator<T>(this.tree));
		}

		@Override
		public int size() {
			
			return tree.size();
		}
		
		private static class BinarySearchTreeIterator<C extends Comparable<C>> implements java.util.Iterator<C> {
             
			private BinarySearchTree<C> tree = null;
			private BinarySearchTree.Node<C> last = null;
			private Deque<BinarySearchTree.Node<C>> toVisit = new ArrayDeque<BinarySearchTree.Node<C>>();
			
			protected BinarySearchTreeIterator(BinarySearchTree<C> tree) {
				this.tree = tree;
				if (tree.root != null){
					toVisit.add(tree.root);
				}
			}
			@Override
			public boolean hasNext() {
				if (toVisit.size() > 0) {
					return true;
				}
				return false;
			}
			
			

			@Override
			public C next() {
			    while (toVisit.size() > 0) {
			    	BinarySearchTree.Node<C> n = toVisit.pop();
			        
			    	if (n.lesser != null) {
			    		toVisit.add(n.lesser);
			    	}
			    	if (n.greater != null) {
			    		toVisit.add(n.greater);
			    	}
			    	
			    	last = n;
			        return n.id;
			    }
				return null;
			}
			
			public void remove() {
			   //
			}
			
		}
    	
    }
}
