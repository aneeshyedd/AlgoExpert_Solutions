package LinkedList;
import static org.junit.Assert.assertTrue;
import java.util.*;
import org.junit.Test;

public class TestSumLinkedList {

	@Test
	  public void TestCase1() {
		SumLinkedList.LinkedList ll1 = addMany(new SumLinkedList.LinkedList(2), new int[] {4, 7, 1});
		SumLinkedList.LinkedList ll2 = addMany(new SumLinkedList.LinkedList(9), new int[] {4, 5});
		SumLinkedList.LinkedList expected = addMany(new SumLinkedList.LinkedList(1), new int[] {9, 2, 2});
	    var actual = new SumLinkedList().sumOfLinkedLists(ll1, ll2);
	    assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
	  }

	  public SumLinkedList.LinkedList addMany(SumLinkedList.LinkedList linkedList, int[] values) {
	    var current = linkedList;
	    while (current.next != null) {
	      current = current.next;
	    }
	    for (var value : values) {
	      current.next = new SumLinkedList.LinkedList(value);
	      current = current.next;
	    }
	    return linkedList;
	  }

	  public ArrayList<Integer> getNodesInArray(SumLinkedList.LinkedList linkedList) {
	    ArrayList<Integer> nodeValues = new ArrayList<Integer>();
	    SumLinkedList.LinkedList current = linkedList;
	    while (current != null) {
	      nodeValues.add(current.value);
	      current = current.next;
	    }
	    return nodeValues;
	  }
}
