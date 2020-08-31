import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import randomizedQueuesAndDeques.Deque;

public class DequeTest {

	@Test
	public void testIsEmpty() {
		Deque<Integer> deque = new Deque<Integer>();
		 assertEquals(deque.isEmpty(), true);
	}

	@Test
	public void testSize() {
		Deque<Integer> deque = new Deque<Integer>();
		deque.addFirst(1);
		assertEquals(deque.size(), 1);
	}

	@Test
	public void testAddFirst() {
		Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(1);
        assertEquals(deque.size(), 1);
        assertEquals(deque.isEmpty(), false);

        deque.addFirst(2);
        assertEquals(deque.size(), 2);
	}

	@Test
	public void testAddLast() {
		Deque<Integer> deque = new Deque<Integer>();
        deque.addLast(1);

        assertEquals(deque.size(), 1);
        assertEquals(deque.isEmpty(), false);

        deque.addLast(2);
        assertEquals(deque.size(), 2);
	}

	@Test
	public void testRemoveFirst() {
		Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        
        assertEquals((int) deque.removeFirst(), 3);
        assertEquals(deque.size(), 2);
        assertEquals((int) deque.removeFirst(), 2);
        assertEquals(deque.size(), 1);
        assertEquals((int) deque.removeFirst(), 1);
        assertEquals(deque.size(), 0);
	}

	@Test
	public void testRemoveLast() {
		Deque<Integer> deque = new Deque<Integer>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        
        assertEquals((int) deque.removeLast(), 3);
        assertEquals(deque.size(), 2);
        assertEquals((int) deque.removeLast(), 2);
        assertEquals(deque.size(), 1);
        assertEquals((int) deque.removeLast(), 1);
        assertEquals(deque.size(), 0);
	}



}

