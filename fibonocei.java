class Example
 {
    public static void main(String[] args) 	
{
        int a[] = new int[]{3, 5};        
	 int n = 10; 

        int fib1 = a[0];
        int fib2 = a[1];
        System.out.print(fib1 + " " + fib2 + " ");

        for (int i = 2; i < n; i++) 
{
            int next = fib1 + fib2;
            System.out.print(next + " ");
            fib1 = fib2;
            fib2 = next;
        }
    }
}
