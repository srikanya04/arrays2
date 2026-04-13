class Main
{
 public static void main(String[]args)
{
	String s1="hello all good morning";
	char[] a=s1.toCharArray();
	String s2="";
	for(int x=0;x<a.length;x++)
	{
		if (s1.indexOf(a[x])!=s1.lastIndexOf(a[x]))
		{
			if (x==s1.indexOf(a[x]))
			s2+=a[x];
		}
	}
	System.out.println(s2);
}
}// sub string method next 