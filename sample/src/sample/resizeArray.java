package sample;

import java.util.Arrays;
import java.util.Scanner;

public class resizeArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		int[] newArray = Arrays.copyOf(arr,n+2);
		newArray[n] = 23;
		newArray[n+1]=11;
		
		for(i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
	}

}
