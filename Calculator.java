/*
 Q.1: Design a Calculator class which contains four lambda methods:
a. add(a, b)
b. difference(a, b)
c. product(a, b)
d. safeDivision(a, b)
Also design the main methods which pass actual parameters to test the Calculator class.
 */

//---------------#########################-----------------
interface Calcu
{
	 int val(int a, int b);
}
public class Calculator {
	public static void main(String[] ar)
	{
		Calcu add=(a,b)->(a+b);
		System.out.println(add.val(40, 20));
		Calcu difference=(a,b)->(a-b);
		System.out.println(difference.val(40, 20));
		Calcu product=(a,b)->(a*b);
		System.out.println(product.val(40, 20));
		Calcu safeDivision=(a,b)->(a/b);
		System.out.println(safeDivision.val(40, 20));
	}

}
