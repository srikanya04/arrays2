class Rotation
{
public ststic void main(String[]args)
     {
	int a[] = new int []{10,20,30,40,50,60,70,80,90};
	int temp=a[0],x;
	for(x=0;x<=a.length-2;x++)
	      {
		a[x]=a[x+1];
		System.out.println(a[x]+" ");
		a[x]=temp;
	      }
		System.out.println(temp);																																																									
     }
}	 