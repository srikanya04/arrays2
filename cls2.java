class Example  
{
public static void main(String[]args)
{ 
	int count=0;
	int a[]=new int[]{3,6,9,4,7,9,10};
 	 for(int x=0;x<=a.length-1;x++)
	{ 

	int num=a[x];
	 if (num%3==0)
	{
	System.out.println("number div by 3"+ num);
	count++;
	}
	else
	{
	System.out.println("number not div by 3"+ num);
	}
	}System.out.println( "number div by 3 count:"+ count); 
}
}