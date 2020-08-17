/*
 Q.2: Create two classes:
 
BaseClass
The Rectangle class should have two data fields-width and height of int types. The class
should have display() method, to print the width and height of the rectangle separated
by space.

DerivedClass
The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of
Rectangle class.The class should have read_input() method, to read the values of width
and height of the rectangle. The class should also overload the display() method to print
the area (width*height) of the rectangle.

Input Format
The first and only line of input contains two space separated integers denoting the
width and
height of the rectangle.

Constraints
1 <= width, height <= 10^3
Output Format
The output should consist of:
Print the width and height of the rectangle.
In the second line, print the area of the rectangle.
 */
//-----------------###############------------------
import java.util.Scanner;

class Rectangle{
	int width=10;
	int height=20;
	void display()
	{
		System.out.println(width+" "+height);
		System.out.println(width*height);
	}
}
public class RectangleArea extends Rectangle {
	Rectangle re=new Rectangle();

	Scanner sc=new Scanner(System.in);
	void read_input() {
	      re.width=sc.nextInt();
	      re.height=sc.nextInt();
	}
	public static void main(String[] ar)
	{
		
		RectangleArea ra=new RectangleArea();
		ra.read_input();
	    ra.re.display();
	}

}