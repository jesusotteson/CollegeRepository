

import static org.junit.Assert.*;

import org.junit.Test;

import randomizedQueuesAndDeques.RandomizedQueue;

public class RandomizedQueueTest {

	@Test
	public void testIsEmpty() {
		 RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		 assertEquals(queue.isEmpty(), true);
	}

	@Test
	public void testSize() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(queue.size(), 2);
	}

	@Test
	public void testEnqueue() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(queue.isEmpty(), false);
	}

	@Test
	public void testDequeue() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.enqueue(2);
		assertEquals(queue.size(), 1);
		queue.dequeue();
		assertEquals(queue.size(), 0);
	}

	@Test
	public void testSample() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.enqueue(1);
		int item = queue.sample();
		assertEquals(item,1);
	}



}