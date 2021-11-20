import java.util.Scanner;
public class Switch_case
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		System.out.print("Press 1 for Arithmetic operations \n 2 for Relational operations \n 3 for logical operations \n 4 for ternary operations \n \n Enter your choice : ");
		int n = sr.nextInt();
		int c=0;
		switch(n)
		{
			
			case 1: System.out.print("Press '+' for Addition \n '-' for substraction \n '*' for multiplication \n '/' for divide \n '%' for modulous \n Enter your choice : ");
					char ch=sr.next().charAt(0);
					System.out.print("enter the values : ");
					float a=sr.nextFloat();
					float b=sr.nextFloat();
					switch(ch)
					{
						case '+': System.out.print("result : "+(a+b));
								break;
						case '-': System.out.print("result : "+(a-b));
								break;
						case '*': System.out.print("result : "+(a*b));
								break;
						case '/': System.out.print("result : "+(a*(1.0)/b));
								break;
						case '%': System.out.print("result : "+(a%b));
								break;
						default: System.out.println("Invalid choice");
					}
					break;
			case 2:	System.out.print("press two numbers for check relation ");
					float i=sr.nextFloat();
					float j=sr.nextFloat();
					if(i>j)
						c=-1;
					else if(i<j)
						c=0;
					else
						c=1;
					switch(c)
					{
						case -1:System.out.print("a is greater than b");
								break;
						case 0: System.out.print("b is greater than a");
								break;
						case 1:System.out.print("a and b are equal ");
								break;
					}
					break;
			case 3:	System.out.print("enter the three sides of triangle : ");
							
					int k=sr.nextInt();
					int l=sr.nextInt();
					int d=sr.nextInt();
					if(k!=l && l!=d)
						c=-1;
					else if (k==l && l!=d || k==d && l!=d || d==l && k!=d)
						c=0;
					else
						c=1;
					switch(c)
					{
						case -1:System.out.print("It is a scalen triangle");
								break;
						case 0: System.out.print("It is isoceles triangle");
								break;
						case 1:System.out.print("It is a equilateral triangle");
								break;
					}
					break;
			case 4:	System.out.println("Press 1 for increament \n 2 for decreament : ");
					int p=sr.nextInt();
					
					System.out.print("enter a number to apply ternary operation : ");
					int m=sr.nextInt();
					switch(p)
					{
						case 1: m+=1;
								System.out.print("after increament a = "+m);
								break;
						case 2:	m-=1;
									System.out.print("after increament a = "+m);
									break;
						default : System.out.println("Invalid choice");
					}
					break;
			default : System.out.print("Invalid Choice");
		}
	}
}
			
						