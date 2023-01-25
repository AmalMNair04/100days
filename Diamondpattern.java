import java.util.Scanner;
public class demo 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("No of rows");
		int rows=scn.nextInt();
		for(int i=1; i<rows; i++)
		{	
			for(int j=rows; j>=i; j--)
			{
				System.out.print(" ");

			}

			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");

			}
			System.out.println();
			
		}
		for(int i=1; i<=rows; i++)
		{	
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");

			}

			for(int k=rows; k>=i; k--)
			{
				System.out.print("* ");

			}
			System.out.println();
			
		}
	

	}

}
