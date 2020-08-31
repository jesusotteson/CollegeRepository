public class Main {

public static void main(String[] args) {

Lock l1=new Combination(1,2,4);

Lock l2=new Combination(1,2,4);

if(l1.equals(l2))

System.out.println("The objects are equal ");

else

System.out.println("The objects are not equal");

}

}