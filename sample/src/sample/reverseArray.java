package sample;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
