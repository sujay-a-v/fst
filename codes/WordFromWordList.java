import java.util.Scanner;
import java.util.StringTokenizer;



public class WordFromWordList {
	public static void main(String[] args)
	{
		//System.out.println("hello");
		Scanner scan=new Scanner(System.in);
		//enter the word list
		System.out.println("enter the words ");
		String s=scan.nextLine();
		
		System.out.println("enter the word to be search");
		String key=scan.nextLine();
		
		Alpha55 a=new Alpha55();
		int ans=a.binary_search(s,key);
		
		if(ans==-1)
		{
			System.out.println("word not found ");
		}
		else
		{
			System.out.println("word found at "+ans);
		}
	}

}


class Alpha55 
{
	public int binary_search(String s,String key)
	{
		int n=0;
		StringTokenizer str=new StringTokenizer(s," ");
		while(str.hasMoreTokens())
		{
			String token=str.nextToken();
			if(key.compareToIgnoreCase(token)==0)
			{
				return n;
			}
			n++;
		}
		return -1;
	}
}