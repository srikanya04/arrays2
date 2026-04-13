class SortArray 
{
    public static void main(String args[]) {
        int[] a = {5, 1, 4, 2, 3};
	for(int x=0;x<a.length;x++)
	{
	int min=x;
		for(int y=x+1;y<a.length;y++)
		{	
		if (a[y]<a[min])
		{
			min=y;
		}}
		int temp=a[min];
		a[min]=a[x];
		a[x]= temp;
		}
	for (int i=0;i<a.length;i++)
	System.out.println(a[i]+ " ");
	
}
	
}	