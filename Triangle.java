/*
 Q.7: Write a program, creating a Triangle class which contains a method that takes three
parameters of the three sides of the triangle, ‘a’, ‘b’, ‘c’, and returns you with the area of the
triangle and print it.

 */
//---------------###################------------

import java.util.Scanner;

public class Triangle {
	public static Scanner sc=new Scanner(System.in);
	void area(double a , double b, double c)
	{
	  double p=(a+b+c)/2;
	  double z=p*(p-a)*(p-b)*(p-c);
	  double i=Math.sqrt(z);
	  System.out.println(i);
	  
	}
	
	public static void main(String[] ar)
	{
		Triangle tr= new Triangle();
		double a=sc.nextFloat();
		double b=sc.nextFloat();
		double c=sc.nextFloat();
			tr.area(a, b, c);	
	}

}