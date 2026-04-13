import java.util.Scanner;
class Main
{
public static void main(String[]args)
{
	Scanner sc= new Scanner (System.in);
	String[]s=new String[6];
	System.out.println("enter 6 names");
	for(int x=0; x<=s.length-1;x++)
	{
	s[x]=sc.next();//s[x]=sc.nextLine();
	}
	System.out.println("You entered these names:");
	for(int x=0;x<=s.length-1;x++)
	{
	System.out.println(s[x]);
	}
}
}

	