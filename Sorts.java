import java.util.*;
class Sorts	{
	public static String sort(String s1)	{
		String str=s1.toLowerCase().replaceAll("\\s+","");
		char c[]=new char[str.length()];
		c=str.toCharArray();
		for(int k=str.length()-1;k>0;k--)
			for(int l=0;l<k;l++)
				if(c[k]<c[l])
					swap(c,k,l);
		return new String(c);
	}

	public static void swap(char c[], int i, int j)	{
		if(i==j)
			return;
		else	{
			char m=c[i];
			c[i]=c[j];
			c[j]=m;
		}
	}  

	public static void main(String args[])	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string:");
		String sortedstr=obj.nextLine();
		String sortedstring= sort(sortedstr);
		System.out.println("Sorted string is :"+sortedstring);
	} 
}