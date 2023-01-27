import java.util.Scanner;
class pattern
{
		public static void main(String[]args)
        {
        		Scanner scn=new Scanner(System.in);
                System.out.println("Enter the no of rows");
                int rows=scn.nextInt();
                for(int i=1;i<=rows;i++)
                {
                		for(int j=1;j<=i;j++)
                        {
                        		System.out.print("*");
                        }
                        System.out.println();
                }
		}
}