package serialize;

import java.util.ArrayList;
import java.util.Random;

public class ExerciseSerialize {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int number = rn.nextInt(15 - 1 + 1) +1;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(number);
		
		for (int i =0; i < 20; i ++) {
			System.out.println(arrayList.add(number));
		}
		System.out.println(arrayList);

	}
}
