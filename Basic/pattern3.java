/*		12345
		22345
		33345
		44445
		55555
		
*/

import java.util.Scanner;
public class pattern3
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the number of rows : ");
		int n=sr.nextInt();
		int c;
		for (int i=1;i<=n;i++)
		{
			c=i;
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
				{
					System.out.print(c+" ");
					c++;
				}
				else
					System.out.print(c+" ");
			}
			System.out.print("\n");
		}
	}
}