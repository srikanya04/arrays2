class Example
{
public static void main(String[]args)
{ 
	int a[]=new int[]{121,1221,112211};
 	 for(int x=0;x<=a.length-1;x++)
	{ 
	int num=a[x],rev=0,rem=0,copy=num;

	while(num!=0)
	{
	rem= num%10;
	rev=rev*10+rem;
	 num=num/10;
	}
	
	if (copy==rev)
	System.out.println("palindrome");
	 else
	System.out.println("not palindrom");
	 
} 
}
}