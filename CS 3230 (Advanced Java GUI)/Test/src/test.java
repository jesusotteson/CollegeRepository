import java.util.StringTokenizer;

public class test{

	static String input = "T1D1T2D2T3D3T4";
	static String delims = "D1D2D3";
	
     public static void main(String []args){
    	 StringTokenizer st = new StringTokenizer(input, delims);
    	 while (st.hasMoreTokens())
    	 	System.out.print(st.nextToken() + " ");
    	 
     }
}
