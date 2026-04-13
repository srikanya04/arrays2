class Main 
{
    public static void main(String[] args) 
{
        String s1 = "morning";
        char[] ch = s1.toCharArray();

               for (int i = 0; i < ch.length; i++) 
		{
            	for (int j = i + 1; j < ch.length; j++) 
			{
                	if (ch[i] > ch[j]) 
				{
                    		char temp = ch[i];
                    		ch[i] = ch[j];
                    		ch[j] = temp;
                		}
            		}
        	}

        	String asc = new String(ch);
        	System.out.println("Ascending: " + asc);

               String desc = "";
        	for (int i = ch.length - 1; i >= 0; i--) 
		{
            		desc = desc + ch[i];
        	}
        	System.out.println("Descending: " + desc);
 }
}
