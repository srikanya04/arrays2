 class Main
 {
    public static void main(String[] args)
 {
        String s = " hello all good morning";
        s = s.trim();  
        int count = 0;

       for (int i = 0; i < s.length(); i++) 
	{
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') 
		{
                count++;
            	}
        }

       System.out.println("Word count: " + (count + 1));
    }
}
