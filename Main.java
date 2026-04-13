class Main{
    public static void main(String args[]) {
       	int[] a = {1, 2, 2, 3, 1, 4, 2};
	Boolean []b = new Boolean[a.length];
	for(int x=0;x<a.length;x++)
	{ 
	if (b[x]==true)
		{
		 continue;
		}
	int count = 1;
	for(int y=x+1;y<a.length;y++)
	{
	if(a[x]==a[y])
		{
		count++;
		b[y]=true;
	 	}
	}
	System.out.println(a[x]+" occurs " + count + " times");

}
}
}
	

	