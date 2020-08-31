import java.util.StringTokenizer;

public class STDemo 
{

	public static void main(String[] args) 
	{
		String 						data = "AxByCzD";
		//StringTokenizer 			st = new StringTokenizer(data, "xyz");
		//StringTokenizer 			st = new StringTokenizer(data, "xyz", false);
		StringTokenizer 			st = new StringTokenizer(data, "xyz", true);
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
