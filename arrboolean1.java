import java.util.Scanner;
class Main
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        boolean[] b = new boolean[5];

        System.out.println("Enter 5 boolean values (true/false):");
        for (int x = 0; x < b.length; x++) 
	{
            b[x] = sc.nextBoolean();
        }

        System.out.println("You entered:");
        for (int x = 0; x < b.length; x++) 
	{
            if (b[x]) 
		{
                System.out.println(1); //true
            
		} else
		{
                System.out.println(0); //false
             	}
        }
 }
}
