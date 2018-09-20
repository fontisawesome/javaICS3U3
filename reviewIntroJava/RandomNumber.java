// The "RandomNumber" class.
import java.awt.*;
import hsa.Console;

public class RandomNumber
{
    public int randomNumber;
    static Console c;           // The output console
    public RandomNumber(){
	c = new Console();
    }
    public void randomNumberGeneration(){
	
	
	randomNumber = (int)Math.floor(Math.random()*23 - 5);
	c.print(randomNumber);
    }
    public static void main (String[] args)
    {
	RandomNumber d = new RandomNumber();
	d.randomNumberGeneration();
	// Place your program here.  'c' is the output console
    } // main method
} // RandomNumber class
