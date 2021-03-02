/* Write a Java Program to check if the Number is Even or Odd. */

import java.util.Scanner;
public class OddOrEven {

	void oddoreven(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is an Even Number");
		}
		else
		{
			System.out.println(num+" is an Odd Number");
		}
	}
	public static void main(String[] args)
	{
		OddOrEven o = new OddOrEven();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		o.oddoreven(n);
	}
}
