class Example 
{
    public static void main(String[] args) 
    {
        char ch[] =  new char[]{'a','t','g','K','p','Q',' ','*','&'};
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
	for( int x=0;x<=ch.length-1;x++)
	{ 	
		char c=ch[x];
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println(c+": vowels");
			count1++;
		}
		else if(c>='a'&& c<='z'||c>='A'&& c<='Z')
		{
			System.out.println(c+ ": consonant");
			count2++;
		}


		else  if(c>='0'&& c<='9')
		{
			System.out.println(c+ ": digits");
			count3++;
		}
		else if(c==' ')
		{
			System.out.println(c+ ": space");
			count4++;
			
		}
		else{ 
		
			System.out.println(c+": symbols");
			count5++;
			
		}
		
	}
System.out.print( " vowels: "+count1+ " "+" consonant:"+ count2+ " " + " digits: "+count3+" "+ " space: "+count4+" "+ "symbols: "+count5);
   }
}
