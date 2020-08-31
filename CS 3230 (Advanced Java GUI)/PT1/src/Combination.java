
public class Combination extends Lock
{
	int first;
	int second;
	int third;

	public Combination(int first, int second, int third) 
	{
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public boolean equals(Object o) 
	{
		if (!(o instanceof Combination)) 
		{
		return false;
		}
		else
		{
			Combination c=(Combination)o;
			if(this.first==c.first&& this.second==c.second && this.third==c.third)
			{
				return true;
			}
			else
			return false;
		}
	}
}