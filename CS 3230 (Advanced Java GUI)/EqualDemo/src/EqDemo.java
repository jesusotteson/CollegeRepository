
public class EqDemo 
{
	
	//@SuppressWarnings("deprecation")//  A warning that advises there is a better way to format the code to improve data and perfomance use.
	public static void main(String[] args) 
	{	//Version 1						This version will display "o1 != o2" because they o1 and o2 are pointing to different addresses.
		//Integer o1 = new Integer(10);	
		//Integer o2 = new Integer(10);
		
		//Version 2						This version will display "o1 == o2" because when creating "Hello World" it creates a string literal which
		//String o1 = "Hello World";//	means that Java will create a literal string for "Hello World" and reference back to it if anything identical
		//String o2 = "Hello World";//	is created.
		
		//Version 3						As this is producing the result "o1 != o2" as the strings presented are not identical, but it is resulting in
		//String o1 = "Hello World";//	"o1 equals o2" because the concatenated results are the same.
		//String o2 = "Hello ";
		//o2 += "World";
		
		//Version 4						Switching from "new" to ".valueOf" is called creating a factory method.
		Integer o1 =  Integer.valueOf(10);	
		Integer o2 =  Integer.valueOf(10);
	
		if (o1 == o2)
			System.out.println("o1 == o2");
		else
			System.out.println("o1 != o2");
		
		if (o1.equals(o2))
			System.out.println("o1 equals o2");
		else
			System.out.println("Not equal");
	}

}
