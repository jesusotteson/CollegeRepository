package BalloonLab;

public class Balloon {

	boolean Helium;
	Size balloonSize;
	String imagePath;

	@Override
	public String toString() {
		return balloonSize + " " + ((Helium) ? "Helium" : "Air");
	}
	public String getImagePath() {
		return imagePath;
	}
	public Balloon(Size s, boolean h) {
		Helium = h;
		balloonSize = s;

		switch (s) {
		case XS:
			imagePath = "/BalloonLab/images/balloon20.jpg";
			break;
		case S:
			imagePath = "/BalloonLab/images/balloon40.jpg";
			break;
		case M:
			imagePath = "/BalloonLab/images/balloon60.jpg";
			break;
		case L:
			imagePath = "/BalloonLab/images/balloon80.jpg";
			break;
		case XL:
			imagePath = "/BalloonLab/images/balloon100.jpg";
			break;

		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Helium ? 1231 : 1237);
		result = prime * result + ((balloonSize == null) ? 0 : balloonSize.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (Helium != other.Helium)
			return false;
		if (balloonSize != other.balloonSize)
			return false;
		return true;
	}
}
