package string;

import java.util.Scanner;

public class CountSpecialChar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			{
				if(Character.isLetterOrDigit(ch)==false) 
				{
					 sp++;
				}
			}
		}
		System.out.println("number of special character :" +sp);

	}

}
