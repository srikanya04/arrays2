class Example
{
public static void main(String[]args)
{ 
int a[]= new int[]{10,20,30,40,50,65,60,70,77,85,765,98,53};
	int product=1;
 for( int x=0;x<a.length;x++)
	{
	int num=a[x];
	product =product*num;
	
	}
	System.out.println(product);
}
}