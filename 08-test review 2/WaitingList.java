public class WaitingList
{
	private int numNodes;
	private ListNode front;
	
	// returns the number of nodes in this list
	public int size()
	{  return numNodes;  }
	
	
	// returns a reference to the node at index k,
	// where the indexes are numbered 0 through size()-1
	// precondition: 0 <= k < size()
	private ListNode getKthNode(int k)
	{  /* to be implemented in part (a) */
		if(k<0 || k>size()) {
			System.out.println("You LIED!");
			return null;
		}
		
		ListNode next = front;
		while(k>0) {
			next = next.getNext();
			k--;
		}
		
		return next;
	}
	
	
	// removes the last num nodes from other and attaches them
	// in the same order to the end of this WaitingList;
	// updates the number of nodes in each list to reflect the move
	// precondition:  size() > 0;
	//                0 < num <= other.size()
	public void transferNodesFromEnd(WaitingList other, int num)
	{  /* to be implemented in part (b) */ 
		// minimalist diagram:
		//     nodeA | nodeB
		
		if(num==other.size()) {
			ListNode nodeA = other.front;
			ListNode here = this.getKthNode(this.size());
			here.setNext(nodeA);
			other.front = null;
			return;
		}
		
		ListNode nodeA = other.getKthNode(other.size()-num);
		ListNode nodeB = other.getKthNode(other.size()-num+1);
		ListNode here = this.getKthNode(this.size()-1);
		
		here.setNext(nodeB);
		nodeA.setNext(null);
		return;
	}
	
	// There may be fields, constructors, and methods that are not shown.
}
