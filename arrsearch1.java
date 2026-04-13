class Main 
{
    public static void main(String[] args) 
{

        int[] a = new int[]{10, 20, 30, 40, 50};
        int search = 40;
        boolean found = false;

        for (int x = 0; x < a.length; x++) 
	{
            if (a[x] == search) 
		{
                System.out.println(a[x]);          
	        found = true;

                }
        }

        if (!found) 
	{
            System.out.println("Element not found");
        }
    }
}
