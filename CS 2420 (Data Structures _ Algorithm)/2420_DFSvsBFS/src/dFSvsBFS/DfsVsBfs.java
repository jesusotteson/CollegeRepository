package dFSvsBFS;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.DepthFirstPaths;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

public class DfsVsBfs {

	public static void main(String[] args) {
		int source = 1;
		Graph g = new Graph(new In("src/cityGraph/Jingshis.txt"));
		DepthFirstPaths dfs = new DepthFirstPaths(g, source);
		BreadthFirstPaths bfs = new BreadthFirstPaths(g, source);

		System.out.println("Adjacency List:");
		System.out.printf("----------", "------------------");
		System.out.println(g.toString());

		System.out.printf("%-30.30s %-30.30s%n", "Paths DFS:", "ShortestPaths BFS:");
		System.out.printf("%-30.30s %-30.30s%n", "----------", "------------------");
		for (int p = 0; p < g.V(); p++) {
			System.out.printf("%-30.30s  %-30.30s%n", dfs.pathTo(p), bfs.pathTo(p));
		}
	}

}
