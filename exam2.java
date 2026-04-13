class Main 
{
    public static void main(String[] args) 
{
        String s1 = "Hello123@World@&*";
        char[] ch = s1.toCharArray();

        int upper = 0, lower = 0, digit = 0, symbol = 0;

        for (int i = 0; i < ch.length; i++) 
	{
            if (ch[i] >= 'A' && ch[i] <= 'Z')

            	upper++;
            else if (ch[i] >= 'a' && ch[i] <= 'z')
                lower++;
            else if (ch[i] >= '0' && ch[i] <= '9')
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
