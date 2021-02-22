package LinkedList;

public class RemoveDuplicates {
	
	public static class LinkedList 
	{
		public int value;
	    public LinkedList next;

	    public LinkedList(int value) 
	    {
	      this.value = value;
	      this.next = null;
	    }
	}
	
	public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList)
	{
	    LinkedList currentNode = linkedList;
	    while(currentNode != null)
	    {
	    	LinkedList nextNode = currentNode.next;
	    	while(nextNode != null && nextNode.value == currentNode.value)
	    	{
	    		nextNode = nextNode.next;
	    	}
	    	
	    	currentNode.next = nextNode;
	    	currentNode = nextNode;
	    }
	    return linkedList;
	}
	
	public static void main(String[] args)
	{
		//Testing with sample input
		//This program implements removing duplicate values from a singly linked list
		RemoveDuplicates obj = new RemoveDuplicates();
		LinkedList list = new LinkedList(1);
		list.next = new LinkedList(1);
		list.next.next = new LinkedList(3);
		list.next.next.next = new LinkedList(4);
		list.next.next.next.next = new LinkedList(4);
		list.next.next.next.next.next = new LinkedList(4);
		list.next.next.next.next.next.next = new LinkedList(5);
		list.next.next.next.next.next.next.next = new LinkedList(6);
		list.next.next.next.next.next.next.next.next = new LinkedList(6);
		
		LinkedList res = obj.removeDuplicatesFromLinkedList(list);
		while(res != null)
		{
			System.out.print(res.value + " ");
			res = res.next;
		}
	}

}
