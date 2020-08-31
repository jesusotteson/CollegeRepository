package puzzle;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Solver {

	private Stack<Board> Cat;
	private int Meow;

	public Solver(Board initial) {
		// find a solution to the initial board (using the A* algorithm)
		if (initial.isSolvable() == false)
			throw new java.lang.IllegalArgumentException();
		Cat = new Stack<>();

		MinPQ<steps> q = new MinPQ<>();
		q.insert(new steps(initial, 0, null));
		while (true) {
			steps move = q.delMin();
			if (move.cat.isGoal()) {
				this.Meow = move.scratch;
				do {
					Cat.push(move.cat);
					move = move.parent;
				} while (move != null);
				return;
			}
			for (Board next : move.cat.neighbors()) {
				if (move.parent == null || !next.equals(move.parent.cat)) // look back one move to prevent useless
																			// looping
					q.insert(new steps(next, move.scratch + 1, move));
			}
		}
	}

	private class steps implements Comparable<steps> {

		private Board cat;
		private int scratch;
		private steps parent;

		public steps(Board c, int ouch, steps p) {
			this.cat = c;
			this.scratch = ouch;
			this.parent = p;
		}

		@Override
		public int compareTo(steps arg0) {
			int difference = this.cat.manhattan() + this.scratch - arg0.cat.manhattan() - arg0.scratch;
			if (difference != 0)
				return difference; 
			if (this.scratch > arg0.scratch)
				return -1; 
			return 1;
		}

	}

	public int moves() {
		return Meow;

	}

	public Iterable<Board> solution() {
		return Cat;
	}

	public static void main(String[] args) {

		// create initial board from file
		In in = new In(args[0]);
		int N = in.readInt();
		int[][] blocks = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				blocks[i][j] = in.readInt();
		Board initial = new Board(blocks);

		// check if puzzle is solvable; if so, solve it and output solution
		if (initial.isSolvable()) {
			Solver solver = new Solver(initial);
			StdOut.println("Minimum number of moves = " + solver.moves());
			for (Board board : solver.solution())
				StdOut.println(board);
		}

		// if not, report unsolvable
		else {
			StdOut.println("Unsolvable puzzle");
		}
	}
}
