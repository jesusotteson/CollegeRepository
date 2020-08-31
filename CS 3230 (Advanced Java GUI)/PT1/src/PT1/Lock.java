
public class Lock 
{

	public boolean equals(Object l) 
	{
		if (l == this) 
		{
			return true;
		}

		if (!(l instanceof Lock)) 
		{
			return false;

		}
		else
		{
			return true;
		}
	}
}