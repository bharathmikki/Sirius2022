package sample;

import java.util.Scanner;

public class elementPresent16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j=0;
		boolean flag = false;
		int n = sc.nextInt();
		int arr[] = new int[n];
		int find = sc.nextInt();
		int[] pos = new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] == find) {
				flag = true;
				pos[j]=i;
				j++;
			}
		}
		if(flag)
		{
			System.out.println("The index of the Element is: ");
			for(i=0;i<j;i++)
			{
				System.out.println(pos[i]);
			}
			System.out.println("The number of times the element found");
			
			System.out.println(j);
		}
	}

}
