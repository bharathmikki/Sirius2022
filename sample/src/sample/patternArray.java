package sample;

import java.util.Scanner;

public class patternArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j,ctr=1;
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				matrix[i][j]=ctr;
				ctr++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("\n");
		}

	}

}
