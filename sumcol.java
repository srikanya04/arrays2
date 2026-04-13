class Sumofcolumn
{
public static void main (String[]args)
{	int sum=0;
	int a[][]=new int[][]{{1,2,3},
			      {4,5,6},
			      {7,8,9}};
	for( int y=0;y<a.length;y++)
	{
		for( int x=0;x<a[y].length;x++)
		{
		sum +=a[x][y];
		
		}System.out.println(sum);
	}
		
}
}
