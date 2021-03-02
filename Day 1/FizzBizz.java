/* Write a program that prints the numbers from 1 to n and for multiples of ‘3’ print “Fizz” instead of the number, 
for the multiples of ‘5’ print “Buzz”, and for the numbers which are divisible by both 3 and 5, print FizzBuzz. */

import java.util.Scanner;
public class FizzBizz {
	void fizzbizz(int a)
	{
		int i;
		for(i=1;i<=a;i++)
		{
			if(i%5==0 && i%3==0)
				{ System.out.println("FizzBizz"); }
			else if(i%5==0)
				
			{ System.out.println("Bizz"); } 
			else if(i%3==0)
				{ System.out.println("Fizz"); }
			else 
			{
				 System.out.println(i); 
			}
		}
	}
	public static void main(String[] args) {
		FizzBizz fb = new FizzBizz();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		fb.fizzbizz(a);
	}
}
