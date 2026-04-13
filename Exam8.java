class Main
{
public static void main(String[] args)
{
     String s = "Hello all good morning";
	String s1 ="";
		
	for(int  i=0;i<s.length();i++)
	     {
		char ch = s.charAt(i);
		if(s.indexOf(ch)!=s.lastIndexOf(ch))
		if(s1.indexOf(ch)==-1)
		  {
		     System.out.print(ch);
			s1=s1+ch;
		  }
	     }
		System.out.println(s1);	

}
		
} 