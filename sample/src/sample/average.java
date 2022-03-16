package sample;

import java.util.Scanner;

public class average {
	
	
	static float avgNum(int n)
	{
		Scanner sc = new Scanner(System.in);
		int i,s=0;
		for(i=0;i<n;i++)
		{
			int num = sc.nextInt();
			s=s+num;
		}
		float average = s/(float)n;
			
		return average;	
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		float avg = avgNum(n);
		
		System.out.println(avg);
		
		

	}

}
