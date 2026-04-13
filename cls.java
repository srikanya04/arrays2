class Example
{
public static void main(String[]args)
{
 int a[]= new int[]{10,20,30,40,50,60,70};
 int b[]= new int []{80,90};
 char c[]= new char[]{'c','b'};
String d[]=new String[]{"hello","all","good","morning"};


	System.out.println(" length of the array:" +a.length);
	System.out.println(" length of the array:" +b.length);
	System.out.println(" length of the array:" +c.length);
	System.out.println(" length of the array:" +d.length);

		for( int x=0;x<=a.length-1;x++)
	 	 System.out.println(a[x]);
		for(int x=0;x<=b.length-1;x++)
		System.out.println( " b array:"+b[x]);
		for( int x=0;x<=c.length-1;x++)
	 	 System.out.println("c array:"+c[x]);
		for(int x=0;x<=d.length-1;x++)
		System.out.println( " d array:"+d[x]);

	
}
}
