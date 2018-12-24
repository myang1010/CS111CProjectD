import java.util.Arrays;

public class LinkedHeadTailList<T> implements HeadTailListInterface<T>{ 

	private Node head, tail;

	public LinkedHeadTailList(){
		head = null;
		tail = null;
	}
	
	/**
	 * Adds a new entry to the beginning of the list. 
	 * Entries currently in the list are shifted down.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addFront(T newEntry){
		Node newNode = new Node(newEntry);
		if (isEmpty()){
			head = newNode;
			tail = newNode;}
		else{
			newNode.next = head;
			head = newNode;
		}
	}
	
	/**
	 * Adds a new entry to the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addBack(T newEntry){
		Node newNode = new Node(newEntry);
		if (isEmpty()){
			head = newNode;
			}
		else
			tail.next = newNode;
		tail = newNode;		
	}

	/**
	 * Removes an entry from the beginning of the list. 
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeFront(){
		T result = null;
		if (!isEmpty()){
			result = head.data;
			head = head.next;

			if (head == null)
				tail = null;
		}
		return result;
	}
	
	/**
	 * Removes an entry from the end of the list. 
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeBack(){
		T result = null;
		if (isEmpty()){
			return result;
		}
		else{
			Node currentNode = head;
			while(currentNode.next.next!= null){
				currentNode = currentNode.next;
			}
			result = tail.data;
			tail = currentNode;
			currentNode.next = null;
			return result;
		}
	}
	
	/** Removes all entries from this list. */
	public void clear(){
		head = null;
		tail = null;
	}
	
	/**
	 * Retrieves the entry at a given position in this list.
	 * 
	 * @param givenPosition An integer that indicates the position of the desired entry.
	 * @return A reference to the indicated entry or null if the index is out of bounds.
	 */
	public T getEntry(int givenPosition){
		T result = null;
		Node currentNode = head;
		if (!isEmpty() && (givenPosition>=0 && givenPosition<size())){
			if (givenPosition == 0)
				result = head.data;
			else if (givenPosition == size()){
				result = tail.data;				
			}
			else{
				for (int i= 0; i<givenPosition; i++){
					currentNode = currentNode.next;
				}
				result = currentNode.data;
			}				
		}
		return result;
	}
	
	/**
	 * Displays the contents of the list to the console, in order.
	 */
	public void display(){
		Node currentNode = head;
		T[] result = (T[]) new Object[size()]; 
		
		for (int index = 0; currentNode!=null && index < size(); index++) {
			result[index] = currentNode.data;
			currentNode = currentNode.next;
		} 
		
		if (isEmpty())
			System.out.println("[]");
		else
			System.out.println(Arrays.toString(result) +"\thead=" + head.data + "\ttail=" + tail.data);		
	}

	/**
	 * Checks whether this list contains a given entry.
	 * 
	 * @param anEntry the object to search for in the list.
	 * @return the position of the entry that was found or -1 if the object is not found.
	 */
	public int contains(T anEntry){
		Node currentNode = head;
		int position = -1;
		boolean found = false;
		int i = 0;
		while (currentNode !=null && !found && i<size()){
			if (anEntry.equals(currentNode.data)){
				found = true;
				position = i;
			}
			else{
				currentNode = currentNode.next;
				i++;
			}				
		}
		return position;
	}

	/**
	 * Gets the length of this list.
	 * 
	 * @return The integer number of entries currently in the list.
	 */
	public int size(){
		int count = 0;
		Node currentNode = head;
		while (currentNode!=null){
			currentNode = currentNode.next;
			count++;
		}
		return count;
	}

	/**
	 * Checks whether this list is empty.
	 * 
	 * @return True if the list is empty, or false if the list contains one or more elements.
	 */
	public boolean isEmpty(){
		return size()==0;
	}
	
	private class Node {
		private T data; // Entry in list
		private Node next; // Link to next node

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		} // end constructor

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		} // end constructor

		private T getData() {
			return data;
		} // end getData

		private void setData(T newData) {
			data = newData;
		} // end setData

		private Node getNextNode() {
			return next;
		} // end getNextNode

		private void setNextNode(Node nextNode) {
			next = nextNode;
		} // end setNextNode
	} // end Node
} 
