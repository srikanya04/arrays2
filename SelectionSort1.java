class SelectionSort 
{
    public static void main(String[] args)
 {
        int[] a = new int[]{64, 25, 12, 22, 11};

        for (int x = 0; x < a.length - 1; x++) 
	{
            int minIndex = x;

            for (int j = x + 1; j < a.length; j++)
		 {
                if (a[j] < a[minIndex]) 
			{
                    minIndex = j;
                	}
           	 }

            int temp = a[minIndex];
            a[minIndex] = a[x];
            a[x] = temp;
        }

        
        for (int i = 0; i < a.length; i++)
	 {
            System.out.print(a[i] + " ");
         }
    }
}
