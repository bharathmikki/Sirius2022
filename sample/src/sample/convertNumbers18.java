package sample;

import java.util.Scanner;

public class convertNumbers18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d;
		int num = sc.nextInt();
		
		String word = " ";
		
		while(num>0)
		{
			d = num%10;
			num = num/10;
			switch(d)
			{
				case 0 : word+="zero";
				break;
				case 1: word+="one";
				break;
				case 2 : word+="two";
				break;
				case 3 : word+="three";
				break;
				case 4 : word+="four";
				break;
				case 5 : word+="five";
				break;
				case 6 : word+="six";
				break;
				case 7 : word+="seven";
				break;
				case 8 : word+="eight";
				break;
				case 9 : word+="nine";
				break;
				default : System.out.println("Invalid");
			}
		}
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.println(word);
		}

	}

}
