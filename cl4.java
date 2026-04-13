import java.util.Scanner;
class Main
{
public static void main (String[]args)
{
	Scanner sc= new Scanner( System.in);
	
	int a[][]=new int[2][2];
	System.out.println("enter 2*2 matrix");
	for( int y=0;y<a.length;y++)//row
	{
		for( int x=0;x<a[y].length;x++)//column
		{
		a[y][x]=sc.nextInt();
		}
		
	}
		for( int y=0;y<a.length;y++)//row
		{
			for( int x=0;x<a[y].length;x++)//column
		
			{
			System.out.print(a[y][x]+"  ");
			}		
			System.out.println();
		}	
}
}		