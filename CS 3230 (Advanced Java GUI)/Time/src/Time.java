public class Time 
{

	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
	}
	
	public Time(int aSeconds)
	{
		hours = aSeconds/ 3600;
		aSeconds %= 3600;
		minutes = aSeconds/ 60;
		aSeconds %= 60;
		seconds = aSeconds % 60;
	}
	
	public Time add(Time t)
	{
		int t1 = t.hours * 3600 + t.minutes * 60 + t.seconds;
		int t2 = this.hours * 3600 + this.minutes * 60 + this.seconds;
		
		return new Time(t1 +t2);
	}
	
	public String toString()
	{
		return "Hours: " + hours + " " + "Minutes: " + minutes + " " + "Seconds: " + seconds;
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject)
			return true;
		
		if (otherObject == null)
			return false;
		
		if (getClass() != otherObject.getClass())
			return false;
		
		Time other = (Time)otherObject;
		
		return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
	}
	
	public static void main(String[] args) 
	{
		
		Time t = new Time(3666);
		System.out.println(t);
		
		Time s = new Time(1, 30, 4);
		System.out.println(s);
		
		Time u = t.add(s);
		System.out.println(u);
		
		Time v = new Time(1, 30, 4);
		
		if (s.equals(v))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
