package string;

public class Reverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//think twice =>kniht eciwt
		String s1= "think twice";
		String s2="";
		String s3="";
		for(int i=s1.length()-1; i>=0; i--) //or//for(int i=11-1; i>=0; i--) 
		{
			s2 = s2 + s1.charAt(i);//eciwt kniht
		}
		String a[]= s2.split(" ");//"eciwt"=0, "kniht"=1
		for(int i=a.length-1; i>=0; i--) //or (int i=2-1; i>=0; i--)
		{
			s3 = s3+a[i] +" ";
		}
		
		System.out.println(s3);
	}

}
