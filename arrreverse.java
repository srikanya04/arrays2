import java.util.Scanner;
class Main
{
 public static void main(String[]args)
{
	Scanner sc= new Scanner(System.in);

	int a[]= new int [4]; 
	System.out.println("enter 4 number");
	for(int x=0;x<=a.length-1;x++)
	{
	a[x]=sc.nextInt();
	}
	System.out.println("Numbers in reverse order:");
	for(int x=a.length-1;x>=0;x--)
	{
	System.out.print(a[x]+" ");
	}
}
}
