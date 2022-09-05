package string;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterAlphabatic 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "uqwertyasdfghzxcvbniopjklm";
		char []a = str.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		

	}

}
