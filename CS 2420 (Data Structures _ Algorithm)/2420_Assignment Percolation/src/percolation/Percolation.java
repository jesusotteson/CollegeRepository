package percolation;
//Program:    Percolation
//Author:     Jesus Otteson & Jingshi Wang

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	int n;
	int size;
	int topRow;
	int bottomRow;
	int numberOpen = 0;
	boolean[][] grid;
	WeightedQuickUnionUF uf1;
	WeightedQuickUnionUF uf2;

	public Percolation(int N) // create N­by­N grid, with all sites blocked
	{
		if (n < 0) {
			throw new IllegalArgumentException("No negative numbers allowed");
		}

		this.n = N;
		size = n * n;

		grid = new boolean[N][N];

		uf1 = new WeightedQuickUnionUF((size + 2));
		uf2 = new WeightedQuickUnionUF((size + 1));
		topRow = size;
		bottomRow = size + 1;

		for (int i = 0; i < n; i++) {
			uf1.union(i, topRow);
			uf2.union(i, topRow);
			uf1.union(size - i - 1, bottomRow);
		}
	}

	public void open(int i, int j) // open site (row i, column j) if it is not open already
	{

		if (i > n - 1 || i < 0 || j > n - 1 || j < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		grid[i][j] = true;
		if (i - 1 >= 0 && grid[i - 1][j]) {
			uf1.union(location(i - 1, j), location(i, j));
			uf2.union(location(i - 1, j), location(i, j));
		}
		if (i + 1 < n && grid[i + 1][j]) {
			uf1.union(location(i + 1, j), location(i, j));
			uf2.union(location(i + 1, j), location(i, j));
		}
		if (j - 1 >= 0 && grid[i][j - 1]) {
			uf1.union(location(i, j - 1), location(i, j));
			uf2.union(location(i, j - 1), location(i, j));
		}
		if (j + 1 < n && grid[i][j + 1]) {
			uf1.union(location(i, j + 1), location(i, j));
			uf2.union(location(i, j + 1), location(i, j));
		}
		numberOpen++;

	}

	public boolean isOpen(int i, int j) // is site (row i, column j) open?
	{
	
		if (i > n - 1 || i < 0 || j > n - 1 || j < 0) {
			throw new IndexOutOfBoundsException("row index " + i + " must be between 0 and " + (n - 1));
		}
		return grid[i][j];

	}

	public boolean isFull(int i, int j) // is site (row i, column j) full?
	{
		if (i > n - 1 || i < 0 || j > n - 1 || j < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds!");
		}
		if (!isOpen(i, j)) {
			return false;
		}
		return uf2.connected(topRow, location(i, j));

	}

	public boolean percolates() // does the system percolate?
	{
		return uf1.connected(topRow, bottomRow);

	}

	public String numberOfOpenSites() {
		return "" + numberOpen;
	}

	private int location(int i, int j) {

		return (n * i) + j;
	}

}
