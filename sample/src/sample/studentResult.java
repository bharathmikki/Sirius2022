package sample;

import java.util.Scanner;

public class studentResult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int[][] student = new int[n][n];
		int[] sum = new int[n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				student[i][j] = sc.nextInt();
				sum[i]+=student[i][j];
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(sum[i]);
		}
	}

}
