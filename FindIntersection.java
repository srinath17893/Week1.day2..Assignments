package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in array find the matching numbers.
		int[] arr1= {1,2,3,5,8,9,7};
		int[] arr2= {2,6,8,5,7};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				}
			}
			
		}

	}

}
