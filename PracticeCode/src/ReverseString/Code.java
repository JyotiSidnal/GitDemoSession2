package ReverseString;

public class Code {

	public static void main(String[] args) {
		 String str="ava";
		 String rev="";
		 for(int i=str.length()-1;i>=0;i--) {
			 rev=rev+str.charAt(i);
		 }
		 
		 if(rev.equals(str))
		 {
			 System.out.println("given string is palindrome");
		 }
		 else
		 {
			 System.out.println("Given string is not palindrome");
		 }

	}

}
