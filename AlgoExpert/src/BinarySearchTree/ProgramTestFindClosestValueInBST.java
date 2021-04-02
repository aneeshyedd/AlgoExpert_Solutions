package BinarySearchTree;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ProgramTestFindClosestValueInBST {

	@Test
	  public void TestCase1() {
	    var root = new FindClosestValueInBST.BST(10);
	    root.left = new FindClosestValueInBST.BST(5);
	    root.left.left = new FindClosestValueInBST.BST(2);
	    root.left.left.left = new FindClosestValueInBST.BST(1);
	    root.left.right = new FindClosestValueInBST.BST(5);
	    root.right = new FindClosestValueInBST.BST(15);
	    root.right.left = new FindClosestValueInBST.BST(13);
	    root.right.left.right = new FindClosestValueInBST.BST(14);
	    root.right.right = new FindClosestValueInBST.BST(22);

	    var expected = 13;
	    var actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
	    assertEquals(expected, actual);
	  }
	
	@Test
	  public void TestCase2() {
	    var root = new FindClosestValueInBST.BST(10);
	    root.left = new FindClosestValueInBST.BST(5);
	    root.left.left = new FindClosestValueInBST.BST(2);
	    root.left.left.left = new FindClosestValueInBST.BST(1);
	    root.left.right = new FindClosestValueInBST.BST(5);
	    root.right = new FindClosestValueInBST.BST(15);
	    root.right.left = new FindClosestValueInBST.BST(13);
	    root.right.left.right = new FindClosestValueInBST.BST(14);
	    root.right.right = new FindClosestValueInBST.BST(22);

	    var expected = 22;
	    var actual = FindClosestValueInBST.findClosestValueInBst(root, 23);
	    assertEquals(expected, actual);
	  }
}
