import java.util.Scanner;
public class loop1 {
	public static void main(String[] args)
	{
		Scanner sr = new Scanner (System.in);
		System.out.print("enter a number where you want to stop series : ");
		int a= sr.nextInt();
		if(a<0)
		 a=(-1)*a;
		for(int i=1;i<=a;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
			else 
				System.out.print((-1)*i +" ");
		}
	}
}
			