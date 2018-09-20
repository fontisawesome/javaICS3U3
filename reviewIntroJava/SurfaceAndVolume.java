// The "SurfaceAndVolume" class.
import java.awt.*;
import hsa.Console;

public class SurfaceAndVolume
{
    static Console c;           // The output console
    final double PI = Math.PI;
    public double height;
    public double radius;
    
    public SurfaceAndVolume(){
	c = new Console();
    }
    public void getInput(){
	c.print("Input the radius of your cylinder: ");
	radius = c.readDouble();
	c.print("Input the height of your cylinder: ");
	height = c.readDouble();
	
    }
    public void output(){
	double surfaceArea = 2*PI*radius*height + 2*PI*Math.pow(radius, 2);
	double volume = 2*PI*Math.pow(radius, 2)*height;
	c.println();
	c.print("The surface area of the cylinder is ");
	c.print(surfaceArea, 0, 1);
	c.print(" and the volume is ");
	c.print(volume, 0, 1);
	c.print(".");
    }
    public static void main (String[] args)
    {
	SurfaceAndVolume d = new SurfaceAndVolume();
	
	d.getInput();
	d.output();
	// Place your program here.  'c' is the output console
    } // main method
} // SurfaceAndVolume class
