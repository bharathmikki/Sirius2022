package sample;

import java.util.Scanner;

public class elementLocation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,j=0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean flag = false;
		int[] index = new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int find = sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==find)
			{
				flag=true;
				index[j]=i;
				j++;
			}
		}
		if(flag) {
			System.out.println("The index of Element is ");
			for(i=0;i<j;i++)
			{
				System.out.println(index[i]);
			}
		}
		else {
			System.out.println("Element not found");
		}
	}

}
