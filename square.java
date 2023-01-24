import java.util.Scanner;
class square
{
		public static void main(String[]args)
		{
				Scanner scn=new Scanner(System.in);
				System.out.println("Rows");
				int rows=scn.nextInt();
				for(int i=1;i<=rows;i++)
				{
						
								for(int j=1;j<=rows;j++)
								{
										if(i==1||i==rows||j==1||j==rows)
										{
												System.out.print(" *");
										}
										else
										{
												System.out.print("  ");
										}
								}
								System.out.println();
				}
		}
		
}