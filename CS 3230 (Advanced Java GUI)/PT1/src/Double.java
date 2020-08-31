
public class Double extends Password
{
	int pin;
	public Double(int pin,String password) 
	{
		super(password);
		this.pin = pin;
	}
	public boolean equals(Object o) 
	{

		if (!(o instanceof Double)) 
		{
			return false;
		}
	
		else
		{
			Double d=(Double)o;
			if(this.pin==d.pin && super.password==d.password)
			{
				return true;
			}
			else
			return false;
		}
	}
}