package sample;

import java.util.Scanner;

public class primeRange {
	
	static boolean checkInput(int num) {
		int i;
		
		if (num<2) {
			return false;
		}
		else {
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					return false;		
				}
			}	
		}
		return true;			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(i=start;i<=end;i++)
		{
			if(checkInput(i))
			{
				System.out.println(i);
			}
		}

	}

}
