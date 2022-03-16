package sample;

import java.util.Scanner;

public class reverseTwoDimensional19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			int start = 0;
			int end = n-1;
			
			while(start<end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				
				start++;
				end--;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}
