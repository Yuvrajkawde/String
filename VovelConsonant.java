package string;

import java.util.Scanner;

public class VovelConsonant
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int cons=0;
		int vov=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		s= s.toLowerCase();
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(c!=' ') 
			{
				if(c=='a'||c=='e'||c=='i'||c=='i'||c=='u') 
				{
					vov++;
				}
				else 
				{
					cons++;
				}
			}
		}
		
		System.out.println("number of vovels :"+vov);
		System.out.println("number of consonant :"+cons);
		
	}

}
