import java.util.Arrays;
class Main
{
 public static void main(String args[])
{
	int []a=new int[] {1, 2, 3, 2, 1};
	int[] rev = new int[a.length];
        for (int i = 0; i < a.length; i++) 
	{
            rev[i] = a[a.length - 1 - i];
        }

           	if (Arrays.equals(a, rev)) 
		{
            	System.out.println("Array is Palindrome");
       		} 
		else 
		{
            System.out.println("Array is NOT Palindrome");
        }
    }
}
