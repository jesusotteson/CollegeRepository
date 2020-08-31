package listVsSet;
/*
 * Modified by Jesus Otteson
 */
import java.awt.Color;

public class ColoredSquare {
	
	private int side;
	private Color color;
	
	public ColoredSquare (int s, Color c) {
		side = s;
		color = c;
	}
	
	public int area() {
		return side * side;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColoredSquare other = (ColoredSquare) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (side != other.side)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + side;
		return result;
	}
	
	public String toString() {
		return "side:" + side + " #" + Integer.toHexString(color.getRGB()).toUpperCase();
	}
}
