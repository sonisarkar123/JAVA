import java.util.Scanner;
public class loop2 {
	public static void main(String[] args)
	{
		Scanner sr = new Scanner (System.in);
		System.out.print("enter a number of students : ");
		int n=sr.nextInt();
		int a=0,b=0,age=0;
		String name="abc";
		String st="xyz",st1="pqr";
		for(int i=0;i<n;i++)
		{
			System.out.print("name of "+(i+1)+" student : ");
			sr = new Scanner (System.in);
			name = sr.nextLine();
			System.out.print("age of "+(i+1)+" student : ");
			sr = new Scanner (System.in);
			age=sr.nextInt();
			System.out.print("\n");
			if(i==0)
				b=age;
			if(a<age)
			{
				a=age;
				st=name;
			}
			if(b>age)
			{
				b=age;
				st1=name;
			}
		}
		System.out.println("\n\nHighest aged student is :\n name = "+st+"    age = "+a );
		System.out.println("\nLowest aged student is :\n name = "+st1+"    age = "+b );
	}
```}