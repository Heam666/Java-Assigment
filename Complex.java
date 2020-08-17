/*
 Q.5: 
 Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are
entered by user.
 */
//------------------#####################-----------

import java.util.Scanner;

public class Complex {
	public Scanner sc=new Scanner(System.in);
	long a=sc.nextInt();
	long b=sc.nextInt();
	void add()
	{
		System.out.println(a+b);
	}
	void difference()
	{
		if (a>b)
		{
		System.out.println(a-b);
	    }
		else
		{
			System.out.println(b-a);
		}
	}	
	void product()
	{
		System.out.println(a*b);
	}
	public static void main(String[] ar)
	{
		Complex cm=new Complex();
		cm.add();
		cm.difference();
		cm.product();
	}

}
