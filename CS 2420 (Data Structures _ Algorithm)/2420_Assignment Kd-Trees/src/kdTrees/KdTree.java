package kdTrees;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Point2D;


public class KdTree<Value> {
	private int size;
	private Node root;

	private class Node {
		private Point2D point;
		private Value value;
		private RectHV recthv;
		private Node left;
		private Node right;

		public Node(Point2D point, Value val, RectHV rectHV) {
			this.point = point;
			this.value = val;
			this.recthv = rectHV;
		}

	}

	public KdTree() {
		size = 0;
		root = null;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}

	public void put(Point2D point, Value val) {
		if (point == null || val == null)
			throw new java.lang.NullPointerException();
		root = put(null, root, point, val, true);
	}

	private Node put(Node parent, Node node, Point2D p, Value val, boolean vertical) {
		if (node == null) {
			size++;
			return new Node(p, val, newRect(parent, p, vertical));
		}

		double compare = CompareXOrY(node, p, vertical);
		if (compare < 0)
			node.left = put(node, node.left, p, val, !vertical);
		else if (compare > 0)
			node.right = put(node, node.right, p, val, !vertical);
		else if (node.point.equals(p))
			node.value = val;
		else
			node.right = put(node, node.right, p, val, !vertical);

		return node;
	}

	public Value get(Point2D p) {
		if (p == null)
			throw new NullPointerException("arguments can't be null");
		return get(root, p, true);
	}

	// private helper method for get
	private Value get(Node node, Point2D p, boolean isVertical) {
		if (node == null)
			return null;

		double compare = CompareXOrY(node, p, isVertical);
		if (compare < 0)
			return get(node.left, p, !isVertical);
		else if (compare > 0)
			return get(node.right, p, !isVertical);
		else if (node.point.equals(p))
			return node.value;
		else
			return get(node.right, p, !isVertical);
	}
	
	public boolean contains(Point2D point){
		if(point == null)throw new java.lang.NullPointerException();
		return get(point) !=null;
	}
	
	public Iterable<Point2D> points(){
		Queue<Point2D> queue = new Queue<>();
		if(size ==0) return queue;
		Queue<Node> nodeQ = new Queue<>();
		
		nodeQ.enqueue(root);
		while(!nodeQ.isEmpty()){
			Node temp = nodeQ.dequeue();
			queue.enqueue(temp.point);
			if (temp.left != null) nodeQ.enqueue(temp.left);
			if (temp.right != null) nodeQ.enqueue(temp.right);
		}
		return queue;
	}
	
	public Iterable<Point2D> range(RectHV rect){
		if (rect == null) throw new NullPointerException();
		Queue<Point2D> pointsInsideRect = new Queue<>();
		range(rect, pointsInsideRect, root);
		return pointsInsideRect;
	}
	
	private void range(RectHV rect, Queue<Point2D> pointsInsideRect, Node node) {
		if (node == null) return;
		if (!rect.intersects(node.recthv)) return;
		if (rect.contains(node.point)) pointsInsideRect.enqueue(node.point);
		range(rect, pointsInsideRect, node.left);
		range(rect, pointsInsideRect, node.right);
	}
	
	public Point2D nearest(Point2D p){
		if(p==null)throw new NullPointerException();
		return nearest(p, root, root.point);
	}
	
	private Point2D nearest(Point2D p, Node node, Point2D winningPoint) {
		if (node == null) return winningPoint;
		if (node.recthv.distanceSquaredTo(p) > winningPoint.distanceSquaredTo(p)) return winningPoint;
		if (p.distanceSquaredTo(node.point) < p.distanceSquaredTo(winningPoint)) winningPoint = node.point;
		
		if (node.left != null && node.left.recthv.contains(p)) {
			winningPoint = nearest(p, node.left, winningPoint);
			winningPoint = nearest(p, node.right, winningPoint);
		} else {
			winningPoint = nearest(p, node.right, winningPoint);
			winningPoint = nearest(p, node.left, winningPoint);
		}
		return winningPoint;
	}
	
	private double CompareXOrY(Node node, Point2D p, boolean isVertical){
		if(isVertical) return p.x() - node.point.x();
		
		else return p.y() - node.point.y();
	}
	
	private RectHV newRect(Node parent, Point2D p, boolean isVertical) {
		if (parent == null) return new RectHV(-Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
		double compare = CompareXOrY(parent, p, !isVertical);

		if (isVertical  && compare >= 0) return new RectHV(parent.recthv.xmin(), parent.point.y(), parent.recthv.xmax(), parent.recthv.ymax());

		if (isVertical  && compare <  0) return new RectHV(parent.recthv.xmin(), parent.recthv.ymin(), parent.recthv.xmax(), parent.point.y());

		if (!isVertical && compare >= 0) return new RectHV(parent.point.x(), parent.recthv.ymin(), parent.recthv.xmax(), parent.recthv.ymax());

		if (!isVertical && compare <  0) return new RectHV(parent.recthv.xmin(), parent.recthv.ymin(), parent.point.x(), parent.recthv.ymax());
		return null;
	}
	
	public static void main(String[] args) {
		String filename = (args[0]);
        In in = new In(filename);
        KdTree<Integer> kdtree = new KdTree<>();
        for (int i = 0; !in.isEmpty(); i++) {
            double x = in.readDouble();
            double y = in.readDouble();
            Point2D p = new Point2D(x, y);
            kdtree.put(p, i);
        }
        StdOut.println("Starting");
		long starttime = System.currentTimeMillis();
		int numberOfTimesToCalculate = 10000000;
		for (int i = 0; i < numberOfTimesToCalculate; i++) {
			kdtree.nearest(new Point2D(StdRandom.uniform(), StdRandom.uniform()));
		}
		long endtime = System.currentTimeMillis();
		double timeTakenInSeconds = (endtime-starttime)/1000.0;
		StdOut.println("Total time: " + timeTakenInSeconds);
		StdOut.println("Average per second: " + numberOfTimesToCalculate / timeTakenInSeconds);
	}
}
