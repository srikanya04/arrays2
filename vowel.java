class Example 
{
    public static void main(String[] args) 
	{
        char ch[] =  new char[]{'a','t','g','K','p','Q'};
	for( int x=0;x<=ch.length-1;x++)
	{ 
	char c=ch[x];
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println((char)(c-32));
		else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
	System.out.println((char)(c+32));
	}
}
}
}

