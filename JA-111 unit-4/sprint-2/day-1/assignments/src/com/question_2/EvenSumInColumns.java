package com.question_2;

public class EvenSumInColumns {
	
	public static void main(String[] args) {
		
		int count = 1;
		
		int[][] arr = new int[3][3];
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j<arr[i].length; j++) {
				
				arr[i][j] = count;
				
				count+=1;
				
			}
			
		}
		
		int rows= arr.length;
		
		int columns = arr[0].length;
		
		for(int k = 0; k<columns; k++) {
			
			int sum = 0;
			
			for(int l = 0; l<rows; l++) {
				
				if(arr[l][k]%2==0) {
					
					sum = sum + arr[l][k];
					
				}
				
			}
			
			System.out.println(sum);
			
		}
		
		
		
	}

}
