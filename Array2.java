class Array 
{
    public static void main(String[] args) 
	{ 
	int a [] = new int[]{76,54,8,865,476,76,988};
	System.out.println( "First half will be printed");
	for(int x=0;x<=(a.length-1)/2;x++)
	{
	System.out.println(a[x]);
	}
	System.out.println( "second half will be printed");
	for(int y=(((a.length-1)/2)+1); y<=a.length-1;y++)
	{
	System.out.println(a[y]);
	}

	}
}