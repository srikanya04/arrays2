import java.util.Scanner;
class ProductDetails
{
	int calTotal(int price, int quantity)
	{
		return price * quantity;
	}
}
class Product
{
    public static void main(String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter product name: ");
        String name = sc.nextLine();
	System.out.print("Enter product price: ");
        int price = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();


        ProductDetails pd = new ProductDetails();
	int total = pd.calTotal(price , quantity);                  
	System.out.println("\n----product bill---");
	System.out.println("product name :" +name);
	System.out.println("price : "+ price);
	System.out.println("quantity : "+ quantity);
	System.out.println("total price :"+total);
	sc.close();
	}
}                