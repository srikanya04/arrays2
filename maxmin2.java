class Main
{
 public static void main(String args[])
{
	int []a=new int[] {1,2,3,4,5,6,7,8,9,10};
	int max=a[0];
	int min=a[0];
	for(int x=0;x<=a.length-1;x++)
	{
		if (a[x]>max)
		{
		max=a[x];
		}
		if(a[x]<min)
		{
		min=a[x];
		}
	}
	System.out.println("max: "+ max);
	System.out.println("min: "+ min);
}
}
	 