package puzzle;

import edu.princeton.cs.algs4.Stack;

public class Board {
	private int N;
	private int[] tiles;
	private int Nada;
	private int hamming;
	private int manhattan;

	// construct a board from an N-by-N array of blocks
	public Board(int[][] blocks) {
		// (where blocks[i][j] = block in row i, column j)
		if (blocks == null)
			throw new NullPointerException();
		N = blocks[0].length;

		tiles = new int[N * N];

		int tile = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (blocks[i][j] == 0)
					Nada = tile;
				tiles[tile++] = blocks[i][j];

			}
		}
	}

	// board size N
	public int size() {
		return N;
	}

	// number of blocks out of place
	public int hamming() {
		if (hamming > 0)
			return hamming;

		hamming = 0;
		for (int i = 0; i < tiles.length; i++) {
			if (tiles[i] != (i + 1) && tiles[i] != 0)
				hamming++;
		}
		return hamming;
	}

	// sum of Manhattan distances between blocks and goal
	public int manhattan() {
		if (manhattan > 0)
			return manhattan;

		manhattan = 0;
		for (int i = 0; i < tiles.length; i++) {
			if (tiles[i] == (i + 1) || i == Nada)
				continue;
			manhattan += Math.abs((i / N) - ((tiles[i] - 1)) / N);
			manhattan += Math.abs((i % N) - ((tiles[i] - 1)) % N);
		}
		return manhattan;

	}

	// is this board the goal board?
	public boolean isGoal() {
		if (tiles.length - 1 != Nada)
			return false;
		for (int i = 0; i < tiles.length - 1; i++) {
			if (tiles[i] != (i + 1)) {
				return false;
			}
		}
		return true;
	}

	// is this board solvable?
	public boolean isSolvable() {
		int inversions = 0;

		if (N % 2 != 0) {
			for (int i = 0; i < tiles.length; i++) {
				if (tiles[i] == 0)
					continue;
				for (int j = 1; j < tiles.length; j++) {
					if (tiles[i] > tiles[j] && tiles[j] != 0) {
						inversions++;
					}
				}
			}
			if (inversions % 2 != 0)
				return false;
		}

		int inversions2 = 0;
		if (N % 2 == 0) {
			for (int i = 0; i < tiles.length; i++) {
				if (tiles[i] == 0)
					continue; // skip zero
				for (int j = 1; j < tiles.length; j++) {
					if (tiles[i] > tiles[j] && tiles[j] != 0) {
						inversions2++;
					}
				}

			}
			inversions2 += Nada / N;
			if (inversions2 % 2 == 0)
				return false;
		}
		return true;
	}

	// does this board equal y?
	public boolean equals(Object y) {
		if (y == this)
			return true;
		if (y == null)
			return false;
		if (this.getClass() != y.getClass())
			return false;
		Board other = (Board) y;
		for (int i = 0; i < tiles.length; i++)
			if (this.tiles[i] != other.tiles[i])
				return false;
		return true;
	}

	// all neighboring boards
	public Iterable<Board> neighbors() {

		Stack<Board> boards = new Stack<>();

		if (Nada / N != 0)
			pushToStack(boards, -N);// up neighbor
		if (Nada / N != N - 1)
			pushToStack(boards, N);// down neighbor
		if (Nada % N != 0)
			pushToStack(boards, -1);// left neighbor
		if (Nada % N != N - 1)
			pushToStack(boards, 1);// right neighbor
		return boards;
	}

	private void pushToStack(Stack<Board> board, int i) {
		swap(tiles, Nada, Nada + i);
		board.push(new Board(tiles, N, Nada + i));
		swap(tiles, Nada, Nada + i);
	}

	private void swap(int[] board, int i, int j) {
		int swap = board[i];
		board[i] = board[j];
		board[j] = swap;
	}

	private Board(int[] block, int N, int zero) {
		this.N = N;
		this.Nada = zero;
		tiles = new int[N * N];
		System.arraycopy(block, 0, tiles, 0, tiles.length);
	}

	// string representation of this board (in the output format specified below)
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append(N + "\n");
		for (int i = 0; i < tiles.length; i++) {
			s.append(String.format("%2d ", tiles[i]));
			if ((i + 1) % N == 0)
				s.append("\n");
		}
		return s.toString();
	}

	// unit tests (not graded)
	public static void main(String[] args) {
	}
}
