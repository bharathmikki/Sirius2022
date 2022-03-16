package sample;

import java.util.Scanner;

public class displayMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int matrix[][] = new int[n][n];
		int ctr = 1;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				matrix[i][j] = ctr;
				ctr++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("\n");
		}	
		
	}

}
