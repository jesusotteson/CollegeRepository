package listVsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class ListVsSetDemo {
	
	private List<ColoredSquare> list;
	private Set<ColoredSquare> set;
	
	public ListVsSetDemo(ColoredSquare... elements) {
		list = new ArrayList<ColoredSquare>();
		set = new HashSet<ColoredSquare>();

		for (ColoredSquare el : elements) {
			addElement(el);
		}

	}

	public String getListElements() {
		StringBuilder sb = new StringBuilder();
		for (ColoredSquare el : list) {
			sb.append(el.toString()).append("\n");
		}
		return sb.toString();
	}

	public String getSetElements() {
		StringBuilder sb = new StringBuilder();
		for (ColoredSquare el : set) {
			sb.append(el.toString()).append("\n");
		}
		return sb.toString();
	}

	public void addElement(ColoredSquare el) {

		list.add(el);
		set.add(el);
	}

}
