class Main
{ 
	public static void main(String[]args)
	{
	String s1="good morning madam";
	String[]words=s1.split(" ");
	for(int x=0;x<words.length;x++)
	{
	String s= words[x];
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	String rev=sb.toString();
	System.out.println(s.equals(rev)?"palindrome":"not palindrome");
}
}
