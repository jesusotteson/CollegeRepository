
public class Password extends Lock
{
	String password;
	public Password(String password) 
	{
		super();
		this.password = password;
	}

	public boolean equals(Object p) 
	{
		if (!(p instanceof Password)) 
		{
			return false;
		}
		else
		{
			Password pw=(Password)p;
			if(this.password==pw.password)
			{
				return true;
			}
			else
			return false;
		}
	}

}