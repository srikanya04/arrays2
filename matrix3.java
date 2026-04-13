class Main
{
    public static void main(String args[])
 {
        int[][] a = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) 
	{
            sum1 += a[i][i];         
            sum2 += a[i][2 - i];      
        }

        System.out.println("Main diagonal sum = " + sum1);
        System.out.println("Other diagonal sum = " + sum2);
    }
}
