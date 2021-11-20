/*        1
		 12
		123
	   1234
	  12345
*/


import java.util.Scanner;
class pattern2
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the number of rows : ");
		int n=sr.nextInt();
		int c=1;
		for(int i=n;i>0;i--)
		{
			c=1;
			for(int j=1;j<=n;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
				{
					System.out.print(c);
					c++;
				}
			}
			System.out.print("\n");
		}
	}
}