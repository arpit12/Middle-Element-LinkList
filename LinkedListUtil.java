class Node  {
 
	Object data;
	Node next;
 
	public Node( Object data, Node next ) {
		this.data = data;
		this.next = next;
	}
}
 
class LinkedList {
 
	Node head;
 
	public void addFirst( Object data ) {
		head = new Node( data, head );
	}
}
 
public class LinkedListUtil {
 
	public static Node getMiddleNode( Node head ) {
		Node cursor = head;
		Node middle = head;
 
	while( cursor.next != null ) {
 
			// Move the cursor one step forward.
			//
			cursor = cursor.next;
			System.out.println("Cursor is "+cursor.data );

 
			// Check if we've reached the end.
			//
			if( cursor.next != null ) {
 
				// Move the cursor one more step forward, 
				// making it a total of two steps.
				//
				cursor = cursor.next;
			System.out.println("Cursor is again " +cursor.data );
 
				// Move the middle cursor only one step forward.
				//
				middle = middle.next;
			System.out.println( "Middle is is "+middle.data );
			}
		}
 
		return middle;
	}
 
	/** 
	 * Test Method
	 */
	public static void main( String[ ] args ) {
 
		// Initialize and populate the linked-list
		//
		LinkedList list = new LinkedList( );
		for( int i = 1; i <= 15; i++ ) {
			list.addFirst( i );
		}
 
		// Returns 3 as the middle node.
		//
		Node middleNode = LinkedListUtil.getMiddleNode( list.head );
		System.out.println( "Mid node is"+middleNode.data );
 
		list.addFirst( 6 );
 
		// Returns 3 (again) as the middle node, since we have an even sized linked-list.
		//
		middleNode = LinkedListUtil.getMiddleNode( list.head );
		System.out.println( "Mid node is"+middleNode.data);
 
		list.addFirst( 7 );
 
		// Returns 4 as the middle node.
		//
		middleNode = LinkedListUtil.getMiddleNode( list.head );
		System.out.println( "Mid node is"+middleNode.data );
	}
}

