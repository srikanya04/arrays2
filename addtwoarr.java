class Addtwoarr
{
public static void main (String[]args)
{ 	
	int a[][]=new int[][]{{1,2,3},
			      {4,5,6},
			      {7,8,9}};
	int b[][]=new int[][]{{1,2,3},
			      {4,5,6},
			      {7,8,9}
        		      };	
	int sum[][] = new int[3][3]; 

        for(int x = 0; x < a.length; x++)
        {
            for(int y = 0; y < a[x].length; y++)
            {
                sum[x][y] = a[x][y] + b[x][y];  
                System.out.print(sum[x][y] + "       ");
            }
            System.out.println(); 
        }
}
}	