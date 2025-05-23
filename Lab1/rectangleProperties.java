import java.lang.Math;
import java.util.Scanner;

public class rectangleProperties{

	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);

	double w;
	double h;

	double perimeter;
	double area;


	System.out.println("Please specify a rectangle width..");
	w = input.nextDouble();
	System.out.println("Rectangle width is "+w);
	System.out.println("Please specify a rectangle height..");
	h = input.nextDouble();
	System.out.println("Rectangle height is "+h);
	

	perimeter = 2*w + 2*h;
	area = w*h;

	System.out.println("Computing ...");


	System.out.println("Rectangle perimeter is "+ perimeter);
	System.out.println("Rectangle area is "+ area);


	}



}