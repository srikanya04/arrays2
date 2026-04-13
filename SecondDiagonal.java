class SecondDiagonal
{
    public static void main(String[] args) 
{
        int a[][] = new int[][] {
            			{1,2,3},
            			{4,5,6},
            			{7,8,9}
            			};

        System.out.print("Primary Diagonal: ");
        for (int x = 0; x < a.length; x++) 
	{
            System.out.print(a[x][x] + "   ");
        }

        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x][a.length - 1 - x] + "   ");
        }
    }
}
