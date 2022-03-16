package sample;

import java.util.Scanner;

public class daysInaMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int year = sc.nextInt();
		
		switch(num) {
		
			case 1:
				System.out.println("31 days");
				break;
			case 2:
				if(year%4==0)
				{
					if(year%100==0)
					{
						if(year%4==0)
						{
							System.out.println("29 days");
						}
						else
						{
							System.out.println("28 days");
						}
					}
					else
					{
						System.out.println("28 days");
					}
				}
				else
				{
					System.out.println("28 days");
				}
				break;
			case 3:
				System.out.println("30 days");
				break;
			case 4:
				System.out.println("30 days");
				break;
			case 5:
				System.out.println("31 days");
				break;
			case 6:
				System.out.println("30 days");
				break;
			case 7:
				System.out.println("31 days");
				break;
			case 8:
				System.out.println("30 days");
				break;
			case 9:
				System.out.println("31 days");
				break;
			case 10:
				System.out.println("30 days");
				break;
			case 11:
				System.out.println("31 days");
				break;
			case 12:
				System.out.println("31 days");
				break;
			default :
				System.out.println("Invalid Month");
		}

	}

}
