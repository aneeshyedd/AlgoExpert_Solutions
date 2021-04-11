package LinkedList;

public class SumLinkedList {

	public static class LinkedList {
	    public int value;
	    public LinkedList next;

	    public LinkedList(int value) {
	      this.value = value;
	      this.next = null;
	    }
	  }

	  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) 
	  {
		  LinkedList dummyNode = new LinkedList(0);
		  LinkedList currentNode = dummyNode;
		  
		  int val1 = 0, val2 = 0;
		  int carry = 0, newValue = 0;
		  
		  while(linkedListOne != null || linkedListTwo != null || carry != 0)
		  {
			  val1 = (linkedListOne != null) ? linkedListOne.value : 0;
			  val2 = (linkedListTwo != null) ? linkedListTwo.value : 0;
			  
			  int sum = val1 + val2 + carry;
				 
			  newValue = sum % 10;
			  LinkedList result = new LinkedList(newValue);
			  currentNode.next = result;
			  currentNode = result;
			  
			  carry = sum / 10;
			 
			  linkedListOne = (linkedListOne != null) ? linkedListOne.next : null;
			  linkedListTwo = (linkedListTwo != null) ? linkedListTwo.next : null; 
		  }
		  
		  return dummyNode.next;
	  }
}
