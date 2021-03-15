package src;

public class Demo1 {
	void forLoop() 
	{
		int i,j;
		System.out.print("For Loop Data.... \n");
		for(i=0;i<=10;i++)
		{
			System.out.print(i+",");
		}
		System.out.print("\n");
		for(j=10;j>=0;j--)
		{
			System.out.print(j+",");
		}
		System.out.println("\n");
	}
	void whileLoop()
	{
		int a=0;
		int b=10;
		System.out.print("\n");
		System.out.println("While Loop....");

		while(a<=10)
		{
			System.out.print(a+",");
			a++;
		}
		System.out.print("\n");
		while(b>=0)
		{
			System.out.print(b+",");
			b--;
		}
		System.out.print("\n");
	}
	void doWhileLoop()
	{
		System.out.println("Do While Loop..");
		int c=0;
		int d=10;
		do
		{
			System.out.print(c+",");
			c++;
		}
		while(c<=10);
		System.out.print("\n");
		do
		{
			System.out.print(d+",");
			d--;
		}
		while(d>=0);
		System.out.print("\n");
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.forLoop();
		d.doWhileLoop();
		d.whileLoop();
		
	}
}
