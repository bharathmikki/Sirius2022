package sample;
import java.util.*;
import java.util.Scanner;

public class primeornot {

	public static void main(String args[]) {
		
		int i;
		boolean f = false;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				f=true;
				break;
			}
		}
		if(!f) 
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}
