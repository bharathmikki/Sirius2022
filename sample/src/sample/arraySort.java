package sample;

import java.util.Arrays;
import java.util.Scanner;

public class arraySort {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
