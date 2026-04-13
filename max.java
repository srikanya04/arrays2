class Example 
{
    public static void main(String[] args) 
	{
        int a[] = new int[]{10, 25, 39, 7, 85, 63, 12};

        int max = a[0]; 

        for (int i = 1; i < a.length; i++) 
	   {
            if (a[i] > max) 
		{
                max = a[i];            
 		}
          }

        System.out.println("Maximum element in the array: " + max);
    	}
}
