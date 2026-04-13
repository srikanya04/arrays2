class Main 
{
    public static void main(String[] args) 
{
        String s1 = "Hello World";
        char[] ch = s1.toCharArray();
        String result = "";

        for (int i = 0; i < ch.length; i++) 
	{
            if (ch[i] >= 'A' && ch[i] <= 'Z') 
		{
                result = result + (char)(ch[i] + 32); 
            	} 
	    else if (ch[i] >= 'a' && ch[i] <= 'z') 
		{
                result = result + (char)(ch[i] - 32); 
            	} else
		{
                result = result + ch[i];
            	}
        }
        System.out.println("Toggled: " + result);
    }
}
