package randomizedQueuesAndDeques;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	
	private Node first;
	private Node last;
	private int size;
	
	private class Node{
		private Item item;
		private Node next;
		private Node prev;
	}
	//construct an empty deque
	public Deque(){
		first=null;
		last=null;
		size=0;
		
	}
	// is the deque empty?
	public boolean isEmpty(){
		return size()==0;
	}
	// return the number of items on the deque
	public int size(){
		return size;
	}
	// insert the item at the front
	public void addFirst(Item item){
		 if (item == null) {
	            throw new java.lang.NullPointerException();
	        }
		Node node = new Node();
		node.item = item;
		if (size() == 0) {
            first = node;
            last = node;
        } else {
            first.prev = node;
            node.next = first;
            first = node;
        }
        size++;
	}
	// insert the item at the end
	public void addLast(Item item){
		if (item == null) {
            throw new java.lang.NullPointerException();
        }
		Node node = new Node();
		node.item = item;
		 if (size() == 0) {
	            first = node;
	            last = node;
	        } else {
	            last.next = node;
	            node.prev = last;
	            last = node;
	        }
	        size++;
	}
	// delete and return the item at the front
	public Item removeFirst(){
		if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
		Item item = first.item;
		if(first == last){
			first= null;
			last = null;
		}else{
			Node second = first.next;
			second.prev = null;
			first.next = null;
			first = second;
		}
		size--;
		return item;
		
	}
	// delete and return the item at the end
	public Item removeLast(){
		if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
		Item item = last.item;
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node oldLast = last;
            last = oldLast.prev;
            last.next = null;
            oldLast.prev = null;
            oldLast = null;
        }
        size--;
		
		return item;
	}
	// return an iterator over items in order from front to end
	@Override
	public Iterator<Item> iterator() {
		return new DequeIterator();
	}
	
	 private class DequeIterator implements Iterator<Item> {
		 
		 private Node current = first;
		 
	        public boolean hasNext() {
	            return current != null;
	        }
	        public Item next() {
	            if (current == null) {
	                throw new java.util.NoSuchElementException();
	            }
	            Item item = current.item;
	            current = current.next;
	            return item;
	        }
	        public void remove() {
	            throw new java.lang.UnsupportedOperationException();
	        }
	    }
	
	public static void main(String[] args){
		
	}

}
