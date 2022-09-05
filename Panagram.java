package string;

import java.util.Arrays;

public class Panagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "two driven jocks help fax my big quiz";
		System.out.println(panagram(s1.toLowerCase()));
	}

	private static boolean panagram(String s1) 
	{
		// TODO Auto-generated method stub
		if(s1.length()<26) 
		{
			return false;
		}
		else 
		{
			for(char ch = 'a'; ch<='z'; ch++) 
			{
				if(s1.indexOf(ch)<0) 
				{
					return false;
				}
			}
			return true;
		}
		
	}
	

}
