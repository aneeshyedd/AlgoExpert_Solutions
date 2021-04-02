package BinarySearchTree;
import java.util.*;

public class FindClosestValueInBST {

	public static int findClosestValueInBst(BST tree, int target) {
	    
		int closest = tree.value;
		
		BST currentNode = tree;
		while(currentNode != null)
		{
			int val = Math.abs(currentNode.value - target);
			if(Math.abs(target - closest)  > val)
				closest = currentNode.value;
			
			if(target < currentNode.value)
				currentNode = currentNode.left;
			else if(target > currentNode.value)
				currentNode = currentNode.right;
			else
				break;
		}
		
	    return closest;
	  }

	  static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	  }
}
