class Example 
{
    public static void main(String[] args) 
	{
        int a[] = new int[]-{10, 25, 39, 7, 85, 63, 12};

        int min = a[0]; 

        for (int i = 1; i < a.length; i++) 
	   {
            if (a[i] < min) 
		{
                min = a[i];            
 		}
          }

        System.out.println("Min element in the array: " + min);
    	}
}
