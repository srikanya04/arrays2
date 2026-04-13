class Main
{
public static void main (String[]args)
{
	int a[][]=new int[][]{{10,20,30},
			      {60,70,80},
			      {40,50,90},
			      {30,70,89}};
	for( int y=0;y<a.length;y++)//row
	{
		for( int x=0;x<a[y].length;x++)//column
		{
		System.out.print(a[y][x]+ "   ");
		}System.out.println();
	}
}
}		