import java.util.Scanner;
class Main
{
public static void main(String[]args)
{
	Scanner sc= new Scanner(System.in);
	boolean[] b = new boolean[5];
	System.out.println("enter Boolean values(true/false)");
	for( int x=0;x<=b.length-1;x++)
	{
	b[x] = sc.nextBoolean();
	}
	System.out.println("You entered Boolean values");
	for( int x=0;x<=b.length-1;x++)
	{
	System.out.println(b[x]);
	}
}
}