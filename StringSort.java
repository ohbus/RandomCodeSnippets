import java.util.*;
class StringSort	{
	public static String sort (String str1)
	{   
		String str=str1.toLowerCase().replaceAll("\\s+","");
		char c[]=new char[str.length()];
		c=str.toCharArray();
		String res=" ";
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}					
			}
			res =res+c[i];
		}
		return res;
	}

	public static void main(String args[])	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=obj.nextLine();
		String sorted=sort(s);
		System.out.println("Sorted string is:"+sorted);
	}
}