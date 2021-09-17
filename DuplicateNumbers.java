package week1.day2.assignments;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 22, 34, 76, 90, 78, 89, 34, 44, 76, 50, 100, 89, 86, 21, 22 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("DuplicateNumber is :" + num[j]);
					}
				}
			}
		}
	}
