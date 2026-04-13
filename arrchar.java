import java.util.Scanner;
class Example
{
public static void main(String[]args)
{
	Scanner sc= new Scanner(System.in);
	char[] c = new char[5];
	System.out.println("enter 5 letters in your name");
	for( int x=0;x<=c.length-1;x++)
	{
	c[x] = sc.next().charAt(0);
	}
	System.out.println("name");
	for( int x=0;x<=c.length-1;x++)
	{
	System.out.println(c[x]);
	}
}
}