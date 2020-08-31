package ufDemoBlank;

public class LinearBinary {

	public static int linear(Integer[] a, int key) {

		for (int i = 0; i <= a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int binary(int[] a, int key) {

		int start = 0;
		int end = a.length;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (key == a[mid]) {
				return mid;
			}
			if (key < a[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
