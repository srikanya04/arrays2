import java.util.Scanner;
class Example
{
 public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int a[]= new int[6];
	System.out.println(" enter 6 numbers");
		for(int x =0;x<=a.length-1;x++)
		{
		a[x]=sc.nextInt();
		}
		System.out.println("array numbers:");
		for( int x =0;x<=a.length-1;x++)
		{
		System.out.println(a[x]);
		}
}
}
	