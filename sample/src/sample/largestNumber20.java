package sample;

import java.util.Scanner;

public class largestNumber20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		int num = sc.nextInt();
		
		int[][]matrix = new int[num][num];
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<num;i++)
		{
			int max=0;
			for(j=0;j<num;j++)
			{	
				if(matrix[i][j]>max)
				{
					max = matrix[i][j];
				}
			}
			System.out.println(max);
		}

	}

}
