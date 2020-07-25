package com.epam.epamtask11;
import java.util.*;
import java.util.stream.IntStream;

public class AverageOfList {

	public static double Average(int[] a) {

		return Arrays.stream(a).mapToDouble(ele -> (double)ele).average().getAsDouble();
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of integers:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" integers one by one : ");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Average of list of numbers is : "+Average(a));
	}

}
