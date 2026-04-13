class Maxmin 
{
    public static void main(String[] args) 
{
        int a[] = {10, 5, 22, 7, 19};

        int max = a[0]; 
        int min = a[0]; 
        for (int x = 1; x < a.length; x++)
	 {
            if (a[x] > max) 
		{
                	max = a[x];
             	}
            	if (a[x] < min) 
		{
                	min = a[x]; 
            	}
        }

        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}
