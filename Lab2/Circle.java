
import java.util.Scanner;
import java.lang.Math;

public class Circle{
  public static void main(String [] args){

  	Scanner input = new Scanner(System.in);
  	double radius;
  	radius = input.nextDouble();

  	System.out.println(radius);
  	double perimeter = 2*Math.PI*radius;

  	System.out.println("The circle with radius "+ radius + " has perimeter "+perimeter);

 // 1. start by declaring your variables

// 2. Display the sentence "Value of radius: " on the screen

// 3. Read the input value and store it in the radius variable

// 4. Compute the perimeter using the appropriate formula

/* 5. display the result using the sentence "The circle with radius " 
+ your value of the radius + 
"has as perimeter: "+ the perimeter you just computed */
}

}