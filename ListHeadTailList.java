import java.util.*;

public class ListHeadTailList<T> implements HeadTailListInterface<T>{

	List<T> list;// initialize to type ArrayList or LinkedList
	
	public ListHeadTailList(){
		list = new ArrayList<T>();
	}
	
	/**
	 * Adds a new entry to the beginning of the list. 
	 * Entries currently in the list are shifted down.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addFront(T newEntry){
		list.add(0,newEntry);
	}
	
	/**
	 * Adds a new entry to the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addBack(T newEntry){
		list.add(newEntry);
	}

	/**
	 * Removes an entry from the beginning of the list. 
	 * Entries currently in the list are shifted up.
	 * The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeFront(){
		if (isEmpty())
			return null;
		else		
			return list.remove(0);
	}
	
	/**
	 * Removes an entry from the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeBack(){
		if (isEmpty())
			return null;
		else
			return list.remove(list.size()-1);
	}
	
	/** Removes all entries from this list. */
	public void clear(){
		list.clear();
	}
	
	/**
	 * Retrieves the entry at a given position in this list.
	 * 
	 * @param givenPosition An integer that indicates the position of the desired entry.
	 * @return A reference to the indicated entry or null if the index is out of bounds.
	 */
	public T getEntry(int givenPosition){
		if (givenPosition>size() || givenPosition <0)
			return null;
		else
			return list.get(givenPosition);
	}
	
	/**
	 * Displays the contents of the list to the console, in order.
	 */
	public void display(){
		if (isEmpty())
			System.out.println("[]");
		else
			System.out.println(Arrays.toString(list.toArray()) +"\thead=" + list.get(0) + "\ttail=" + list.get(size()-1));
	}
	
	/**
	 * Checks whether this list contains a given entry.
	 * 
	 * @param anEntry the object to search for in the list.
	 * @return the position of the entry that was found or -1 if the object is not found.
	 */
	public int contains(T anEntry){
		return list.indexOf(anEntry);
	}

	/**
	 * Gets the length of this list.
	 * 
	 * @return The integer number of entries currently in the list.
	 */
	public int size(){
		return list.size();
	}

	/**
	 * Checks whether this list is empty.
	 * 
	 * @return True if the list is empty, or false if the list contains one or more elements.
	 */
	public boolean isEmpty(){
		return size()==0;
	}	
}
