import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FactionCalc 
{
	public static volatile boolean done = false;
	
	public static String getUserInput() 
	{
        System.out.println("Please enter a two fraction mathematical expression");
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        if (s.hasNext()) {
            String input = s.nextLine().trim();
            if (isFraction(input)) return input;
        }
        System.out.println("Invalid Expression \nAcceptable expressions should be formated like so: 1/8 + 9/10\nExiting Program");
        System.exit(0);
        return null;
    }
	
    public static void parseAndExecute(String input) 
    {
        String token;
        ArrayList<String> tokens = new ArrayList<String>();
        input = input.replaceAll("--", " - -"); 
        StringTokenizer st = new StringTokenizer(input, "/ () + *");
        if (input.chars().filter(e -> e == '/').count() == 3) new Thread(() -> division(tokens)).start();
        if (input.chars().filter(e -> e == '+').count() == 1) new Thread(() -> addition(tokens)).start();
        if (input.chars().filter(e -> e == '*').count() == 1) new Thread(() -> multiplication(tokens)).start();
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if (token.endsWith("-") || token.matches("-(\\d+)-(\\d+)") || token.matches("(\\d+)-(\\d+)")) new Thread(() -> subtraction(tokens)).start();
            if (token.matches("(\\d+)-(\\d+)") || token.matches("-(\\d+)-(\\d+)")) {
                Pattern pattern = Pattern.compile("(\\d+)");
                Pattern pattern2 = Pattern.compile("^-(\\d+)");
                Matcher matcher2 = pattern2.matcher(token);
                Matcher matcher = pattern.matcher(token);
                while (matcher.find()) {
                    tokens.add(matcher.group(0));
                }
                while (matcher2.find()) {
                    tokens.add(matcher2.group(0));
                }
            }
            if (!token.matches("(\\d+)-(\\d+)") && !token.contains("*") && !token.endsWith("+") && !token.endsWith("+") && !token.endsWith("-"))
                tokens.add(token);
            done = tokens.size() == 4 ? true : false;
        }
    }

    public static void multiplication(ArrayList<String> tokens) 
    {
        while (!done);

        boxOutput(new Fraction(Integer.parseInt(tokens.get(0)), Integer.parseInt(tokens.get(1))).mult(new Fraction(Integer.parseInt(tokens.get(2)), Integer.parseInt(tokens.get(3)))).toString());
    }

    public static void addition(ArrayList<String> tokens) 
    {
        while (!done);
        boxOutput(new Fraction(Integer.parseInt(tokens.get(0)), Integer.parseInt(tokens.get(1))).add(new Fraction(Integer.parseInt(tokens.get(2)), Integer.parseInt(tokens.get(3)))).toString());
    }

    public static void subtraction(ArrayList<String> tokens) 
    {
        while (!done);
        boxOutput(new Fraction(Integer.parseInt(tokens.get(0)), Integer.parseInt(tokens.get(1))).sub(new Fraction(Integer.parseInt(tokens.get(2)), Integer.parseInt(tokens.get(3)))).toString());
    }

    public static void division(ArrayList<String> tokens) 
    {
        while (!done);
        boxOutput(new Fraction(Integer.parseInt(tokens.get(0)), Integer.parseInt(tokens.get(1))).div(new Fraction(Integer.parseInt(tokens.get(2)), Integer.parseInt(tokens.get(3)))).toString());
    }

    public static boolean isFraction(String input) 
    {
        return input.matches("-?[0-9]+[ \\t]*/[ \\t]*-?[0-9]+[ \\t]*[+-/\\\\*][ \\t]*-?[0-9]+[ \\t]*/[ \\t]*-?[0-9]+");
    }

    public static void boxOutput(String input) 
    {
        if (input.startsWith("0")) input = "0";
        if (input.endsWith("1") && (input.indexOf("/")+1 == input.lastIndexOf("1"))) 
        {
            Pattern pattern = Pattern.compile("^.+(?=/)");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                input = (matcher.group());
            }
        }
            input = "Evaluated Expression Result: " + input;
        System.out.print("+");
        for (int i = 0; i < input.length() + 2; i++)
            System.out.print("-");
        System.out.println("+");
        System.out.println("| " + input + " |");
        System.out.print("+");
        for (int i = 0; i < input.length() + 2; i++)
            System.out.print("-");
        System.out.println("+");
    }

    public static void main(String[] args) 
    {
        parseAndExecute(getUserInput());
    }
}
