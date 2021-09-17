package week1.day2.assignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		// number is reversed it should give
		String str="madams";
		String reverse="";
		for (int i= str.length()-1; i>=0; i--) {
			reverse=reverse+ str.charAt(i);
			}
		if(str==reverse) {
			System.out.println("It is palindroe :" +str);
		}
		else {
			System.out.println("Not a Palindrome number");
		}
		

	}

}
