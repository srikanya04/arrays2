class Main
{ 
	public static void main(String[]args)
	{
	String s1="good Morning 345 *&^ madam";
	String[] s2=s.split("");
	
	int upper = 0, lower = 0, digit = 0, symbol = 0;

        for (int i = 0; i < s1.length; i++) 
	char c = s1.charAt(i);
	{
            if (Character.isUpperCase(c))
	

       		upper++;
            else if (Character.isLowerCase(c))
                lower++;
            else if (Character.isDigit(c))
                digit++;
	    
	    else
                symbol++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Symbols: " + symbol);
    }
}
