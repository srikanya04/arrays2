class Example
{
public static void main(String[]args)
{
int a[]= new int[]{10,20,30,40};
int b[]= new int[]{50,60,70};
int c[]= new int[a.length + b.length];
 	for(int x=0;x<a.length;x++)
	{
		c[x]= a[x];
	}
	for( int x=0;x<b.length;x++)
	{
		c[a.length+x]=b[x];
	}
	for( int x=0;x<c.length;x++)
	{
		System.out.println(c[x]);
	}
}
}

	

