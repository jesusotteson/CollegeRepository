public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator) 
	{
        this.numerator = numerator;
        this.denominator = 1;
    }

	public Fraction(int numerator, int denominator) 
	{
        if(numerator < 0 && denominator < 0)
        {
            numerator*=-1;
            denominator*=-1;
        }
        
        this.numerator = numerator;
        this.denominator = denominator;
        reduceFraction(numerator, denominator);
    }
	
	private static int gcd(int u, int v) 
	{
        u = Math.abs(u);
        v = Math.abs(v);
        while (u > 0) {
            if (u < v) {
                int t = u;
                u = v;
                v = t;
            }
            u -= v;
        }
       return v;
    }
	
    private void reduceFraction(int num, int den)
    {
        int v = gcd(num, den);
        this.numerator /= v;
        this.denominator /= v;
    }

    public Fraction add(Fraction f) 
    {
        if (this.denominator == f.denominator)
           return new Fraction(this.numerator + f.numerator, denominator);
        else{
            int lcd = lcd(this.denominator, f.denominator);
            return new Fraction((this.numerator*(lcd/this.denominator) + f.numerator*(lcd/f.denominator)), lcd);
        }
    }

    
    public Fraction sub(Fraction f) 
    {
        if (this.denominator == f.denominator)
            return new Fraction(this.numerator - f.numerator, denominator);
        else
        {
            int lcd = lcd(this.denominator, f.denominator);
            return new Fraction((this.numerator*(lcd/this.denominator) - f.numerator*(lcd/f.denominator)), lcd);
        }
    }

    public Fraction div(Fraction f) 
    {
            return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }

    public Fraction mult(Fraction f) 
    {
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    private int lcd(int denominatorA, int denominatorB)
    {
        int factor = denominatorA;
        while ((denominatorA % denominatorB) != 0)
            denominatorA += factor;
        return denominatorA;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Boolean equals(Fraction f) {
        return (this.numerator == f.numerator && this.denominator == f.denominator);
    }


    public static void main(String args[]) 
    {
        Fraction a = new Fraction(-1,30);
        Fraction b = new Fraction(-2,60);
        System.out.println( b.add(a).toString());

    }
}
