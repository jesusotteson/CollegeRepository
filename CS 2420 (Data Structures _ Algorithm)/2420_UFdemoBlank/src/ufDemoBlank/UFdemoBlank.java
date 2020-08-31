package ufDemoBlank;

import java.util.Random;

import edu.princeton.cs.algs4.QuickFindUF;
import edu.princeton.cs.algs4.QuickUnionUF;
import edu.princeton.cs.algs4.StdOut;

public class UFdemoBlank {

	public static void main(String[] args) {
		Random r = new Random();
		int n = 100;
		QuickFindUF uf1 = new QuickFindUF(n);

		for (int i = 0; i < r.nextInt(n); i++) {
			int p1 = r.nextInt(n);
			int p2 = r.nextInt(n);

			if (!uf1.connected(p1, p2)) {
				uf1.union(p1, p2);
			}
		}

		long startTimeuf1 = System.nanoTime();
		StdOut.println(uf1.connected(0, n - 1) + " 0 and 99 are connected");
		long endTimeuf1 = System.nanoTime();

		QuickUnionUF uf2 = new QuickUnionUF(n);

		long startTimeuf2 = System.nanoTime();
		StdOut.println(uf2.connected(0, n - 1) + " 0 and 99 are connected");
		long endTimeuf2 = System.nanoTime();

		long durationuf1 = (endTimeuf1 - startTimeuf1) / 1000;
		long durationuf2 = (endTimeuf2 - startTimeuf2) / 1000;

		StdOut.println(durationuf1 + " QuickFindUF, " + durationuf2 + " QuickUnionUF");

	}

}
