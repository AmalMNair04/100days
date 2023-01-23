import java.util.Scanner;
class pyr
{
		public static void main(String[]args)
		{
				Scanner scn=new Scanner(System.in);
				System.out.println("Rows");
				int rows=scn.nextInt();
				for(int i=1;i<=rows;i++)
				{
						
								for(int j=rows;j>i;j--)
								{
										System.out.print(" ");
								}
								for(int k=1;k<i;k++)
								{
										System.out.print(k+" ");
								}
								System.out.println();
				}
		} 
		
}