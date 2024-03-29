import java.awt.*;


public class CharacterTile extends Tile
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private	static	final	Dimension	SIZE = new Dimension(85, 85);
	protected char symbol;
	protected String chinese;
	protected String wan = "\u842C";
	
	public CharacterTile(char symbol)
	{
		
		this.symbol = symbol;
		setToolTipText(toString());
		
		switch(this.symbol)
		{
		case '1':
			chinese =  "\u4E00";
			break;
		case '2':
			chinese =  "\u4E8C";
			break;
		case '3':
			chinese =  "\u4E09";
			break;
		case '4':
			chinese =  "\u56DB";
			break;
		case '5':
			chinese =  "\u4E94";
			break;
		case '6':
			chinese =  "\u516D";
			break;
		case '7':
			chinese =  "\u4E03";
			break;
		case '8':
			chinese =  "\u516B";
			break;
		case '9':
			chinese =  "\u4E5D";
			break;

		case 'N':
			chinese =  "\u5317";
			break;
		case 'E':
			chinese =  "\u6771";
			break;
		case 'W':
			chinese =  "\u897F";
			break;
		case 'S':
			chinese =  "\u5357";
			break;
		case 'C':
			chinese =  "\u4E2D";
			break;
		case 'F':
			chinese =  "\u767C";
			break;
		}
		
	}
	
	public boolean matches(Tile other)
	{
		CharacterTile otherObject = (CharacterTile) other;
 
		return super.matches(otherObject) && symbol == otherObject.symbol;
	}
	
	public String toString()
	{
		String out = " ";
		
		switch(this.symbol)
		{
		case '1':
			out =  "Character " + this.symbol;
			break;
		case '2':
			out =  "Character " + this.symbol;
			break;
		case '3':
			out = "Character " + this.symbol;
			break;
		case '4':
			out = "Character " + this.symbol;
			break;
		case '5':
			out = "Character " + this.symbol;
			break;
		case '6':
			out = "Character " + this.symbol;
			break;
		case '7':
			out = "Character " + this.symbol;
			break;
		case '8':
			out = "Character " + this.symbol;
			break;
		case '9':
			out = "Character " + this.symbol;
			break;

		case 'N':
			out = "North Wind";
			break;
		case 'E':
			out = "East Wind";
			break;
		case 'W':
			out = "West Wind";
			break;
		case 'S':
			out = "South Wind";
			break;
		case 'C':
			out = "Red Dragon";
			break;
		case 'F':
			out = "Green Dragon";
			break;
		}
		
		return out;
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawString(String.valueOf(this.symbol), 65, 20);
		
		g.setColor(Color.black);
		if(!(this.chinese == null))
		{
			Font f = g.getFont().deriveFont(45F);
			g.setFont(f);
			if(this.chinese == "\u5317" || this.chinese == "\u6771" || this.chinese == "\u897F" || this.chinese == "\u5357")
			{
				g.drawString(this.chinese, 25, 55);
				
			}
			else if(this.chinese == "\u4E2D")
			{
				g.setColor(Color.red);
				g.drawString(this.chinese, 25, 55);
			}
			else if(this.chinese == "\u767C")
			{
				g.setColor(Color.green);
				g.drawString(this.chinese, 25, 55);
			}
			else
			{
				Font f2 = g.getFont().deriveFont(25F);
				g.setFont(f2);
				g.drawString(this.chinese, 35, 30);
			}
		}
		
		if(this.chinese != "\u5317" && this.chinese != "\u6771" && this.chinese != "\u897F" && this.chinese != "\u5357" && this.chinese != "\u4E2D" && this.chinese != "\u767C")
		{
			g.setColor(Color.red);
			g.drawString(this.wan, 35, 60);
		}

	}
}
