class SecondLargest  
{
    public static void main(String args[]) 
{
        int[] a = {5, 9, 2, 7, 1};
        int max = a[0], second = a[0];
		//5             //5
        for (int i = 1; i < a.length; i++) //value = 9//i = 2 → value = 2//i = 3 → value = 7
	{	  
            if (a[i] > max)//9 > 5 (true) //2 > 9 (false)//7 > 9 (false)
		{
                second = max;//second = 5, max = 9//2 > 5(false)//7 > 5 (true)

                max = a[i];//max = 9, second = 5//second = 7
            	} 
		else if (a[i] > second && a[i] != max) 
		{
                second = a[i];
            	}
       }
        System.out.println("Second Largest = " + second);
    }
}
