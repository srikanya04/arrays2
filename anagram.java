import java.util.Arrays;
class Anagram
{
 public static void main (String[]args)
 {
	String s1= new String("cat");
	String s2= new String("act");
	if(s1.length()==s2.length())
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1,ch2))
		{
			System.out.println("Anagram");
		}
	}
	else
	{
		System.out.println("not Anagram");
	}
}
}