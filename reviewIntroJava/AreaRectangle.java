// The "AreaRectangle" class.
import java.awt.*;
import hsa.Console;

public class AreaRectangle
{
    static Console c;       // The output console
    public double length;
    public double width;
    
    public AreaRectangle(){
	c = new Console();
    }
    
    public void getInput(){
	c.print("Insert length of rectangle here: ");
	length = c.readDouble();
	c.print("Insert width of rectangle here: ");
	width = c.readDouble();
    }
    
    public void output(){
	c.println();
	double area = length*width;
	c.print("The area of the rectangle is " + area + ".");
    
    }
    
    public static void main (String[] args)
    {
	AreaRectangle d = new AreaRectangle();
	d.getInput();
	d.output();
	
	// Place your program here.  'c' is the output console
    } // main method
} // AreaRectangle class

