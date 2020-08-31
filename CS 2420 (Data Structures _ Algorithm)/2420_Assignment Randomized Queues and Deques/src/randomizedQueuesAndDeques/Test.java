package randomizedQueuesAndDeques;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RandomizedQueue<String> queue = new RandomizedQueue<String>();
		 StdOut.print("enter: ");
		 String str="";
		 
		 int k = 0;
		 while(!str.equals("done")){
			 str = StdIn.readString();
			 queue.enqueue(str);
			 StdOut.print("enter: ");
			 k++;
			
		 }
		 
		 
		 for (int i = 0; i < k; i++) {
	            StdOut.println(queue.dequeue());
	        }
	}

}