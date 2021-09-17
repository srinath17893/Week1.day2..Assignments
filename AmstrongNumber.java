package week1.day2.assignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int remainder,sum=0;
		int temp=number;
		
		while(number>0) {
		remainder=number%10;
		number=number/10;
		sum=sum+(remainder*remainder*remainder);
		}
		if(temp==sum)
			System.out.println("It is an Amstrong number");
		else
			System.out.println("It is not a Amstrong number");
		
	}

}
