import java.util.Scanner;
public class switch1 
{
	public static void TA(float bs)
	{
		double ta=bs*(0.15);
		System.out.println("TA = "+ta);
	}
	public static void DA(float bs)
	{
		double da=bs*(0.3);
		System.out.println("DA = "+da);
	}
	public static void HRA(float bs)
	{
		double ha=bs*(0.2);
		System.out.println("HRA = "+ha);
	}
	public static void GS(float bs)
	{
		double gs= bs + bs*(0.15) + bs*(0.3) + bs*(0.2);
		System.out.println("GS = "+gs);
	}
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
		int i;
		System.out.print("enter the basic salary of employee : ");
		float bs = sr.nextFloat();
		do
		{
			
			System.out.print("Press 1 for display BS \n      2 for display TA \n      3 for display DA \n      4 for display HRA \n      5 for display GS \n      6 for display all \n      0 for exit \n\n Enter your choice : ");
			i=sr.nextInt();
			switch(i)
			{
				case 0:
						break;
				case 1: System.out.println("basic salary = "+bs);
						break;
				case 2: TA(bs);
						break;
				case 3: DA(bs);
						break;
				case 4: HRA(bs);
						break;
				case 5: GS(bs);
						break;
				case 6: TA(bs);
						DA(bs);
						HRA(bs);
						GS(bs);
						break;
			}
		}while(i!=0);
	}
}