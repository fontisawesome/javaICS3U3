// The "RoundTo" class.
import java.awt.*;
import hsa.Console;

public class RoundTo
{
    static Console c;           // The output console
    public double numberInput;
    public double roundDigit;
    public RoundTo ()
    {
	c = new Console ();
    }


    public void getInput ()
    {
	c.print ("Input number: ");
	numberInput = c.readDouble ();
	c.print ("Round to nearest: ");
	roundDigit = c.readDouble ();
    }


    public void output ()
    {
	int rounded = (int) (Math.round (numberInput / roundDigit) * roundDigit);
	    c.print ("Your rounded number is " + rounded + ".");
    }


    public static void main (String[] args)
    {
	RoundTo d = new RoundTo ();
	d.getInput ();
	d.output ();

	// Place your program here.  'c' is the output console
    } // main method
} // RoundTo class
