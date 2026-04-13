class LeftRotation 
{
    public static void main(String[] args)
 {
        int[] a = {10, 20, 30, 40, 50};

        int first = a[0];                  
        for (int x = 0; x < a.length - 1; x++)
	 {
            a[x] = a[x + 1];             
         }
        a[a.length-1] = first;         
	for (int x = 0; x < a.length; x++)
	{
	System.out.print(a[x]+" ");
	}
}
}
