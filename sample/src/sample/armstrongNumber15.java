package sample;

import java.util.Scanner;

public class armstrongNumber15 {

	private static boolean palindrome(int num) {
		
		int rev=0,d=0;
		int temp=num;
		while(temp>0) {
			d=temp%10;
			rev=rev*10+d;
			temp/=10;
		}
		if(rev==num)
			return true;
		else
			return false;
	}
	
	private static boolean perfect(int num) {
		
		int i = 1,sum=0;
		int temp = num;
		while(i<=temp/2)
		{
			if(temp%i==0)
			{
				sum+=i;
			}
			i++;
		}
		if(sum!=num)
			return true;
		else
			return false;
	}
	
	private static boolean armstrong(int num) {
		
		int dig=0,sum=0;
		int temp = num;
		while(temp>0)
		{
			temp/=10;
			dig++;
		}
		temp = num; 
		while(temp>0)
		{
			int last = temp%10;
			sum+=Math.pow(last,dig);
			temp = temp/10;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(armstrong(num))
		{
			System.out.println("The number is a Armstrong Number");
		}
		else if(perfect(num))
		{
			System.out.println("The Number is a Perfect Number");
		}
		else if(palindrome(num))
		{
			System.out.println("The number is a Palindrome Number");
		}
		else
			System.out.println("The number is None of the Above");

	}

}
