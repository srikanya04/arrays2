class Main 
{
    public static void main(String[] args)
{

        int[] a = new int[]{10, 20, 30, 40, 50};
        int search = 40;
        int count = 0;
        int first = -1;
        int last = -1;

        for (int x = 0; x < a.length; x++) 
	{
            if (a[x] == search) 
		{
                if (count == 0) 
			{
                    	first = x; // store first index
               	 	}
                last = x;   // update last index
                count++;
           	}
        }

        if (count == 0) 
	{
            System.out.println("Element not found");
        }
	else 
	{
            System.out.println("Element = " + search);
            System.out.println("First Index = " + first);
            System.out.println("Last Index = " + last);
        }
    }
}
