package ReverseString;

public class Strings {

	public static void main(java.lang.String[] args) {
		String str="Prograam";
		char[] chars=str.toCharArray();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
						{
					       temp=temp+str.charAt(i);
						}
				//System.out.println(temp);
			
			}
			//System.out.println(temp);
		}
		System.out.println(temp);
	}
	
}
