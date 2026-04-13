class Addsub 
{
public static void main (String[]args)
{	int add=0,sub=0;
	int a[][]=new int[][]{{1,2},
			      {4,5}
			      };
	for( int y=0;y<a.length;y++)
	{
		for( int x=0;x<a[y].length;x++)
		{
		add+=a[y][x];
		sub-=a[y][x];
		
		}
		System.out.println(add);
		System.out.println(sub);
	}
	
}
}
