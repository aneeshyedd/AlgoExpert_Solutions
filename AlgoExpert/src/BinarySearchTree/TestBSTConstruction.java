package BinarySearchTree;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TestBSTConstruction {
	@Test
	  public void TestCase1() {
	    var root = new BSTConstruction.BST(10);
	    root.left = new BSTConstruction.BST(5);
	    root.left.left = new BSTConstruction.BST(2);
	    root.left.left.left = new BSTConstruction.BST(1);
	    root.left.right = new BSTConstruction.BST(5);
	    root.right = new BSTConstruction.BST(15);
	    root.right.left = new BSTConstruction.BST(13);
	    root.right.left.right = new BSTConstruction.BST(14);
	    root.right.right = new BSTConstruction.BST(22);

	    root.insert(12);
	    assertTrue(root.right.left.left.value == 12);

	    root.remove(10);
	    assertTrue(root.contains(10) == false);
	    assertTrue(root.value == 12);

	    assertTrue(root.contains(15));
	  }
}
