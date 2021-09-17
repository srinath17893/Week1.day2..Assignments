package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {1,2,6,5,9,12,11};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			int	j = i+1;
		if(num[i]!=j) {
			System.out.println(j);
			continue;
		}
			
		} 
		
	
	}

}
