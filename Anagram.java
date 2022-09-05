package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = "SILENT";// team
		String s2 = "LISTEN";// meat 
		
		char a[]= s1.toCharArray();
		char b[]= s2.toCharArray() ;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		//System.out.println(a);
		if(result==true) 
		{
			System.out.println("String is anagram");
		}
		else 
		{
			System.out.println("String is not anagram");
		}
		
	}

}
