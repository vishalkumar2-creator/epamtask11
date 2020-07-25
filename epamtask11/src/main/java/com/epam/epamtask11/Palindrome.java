package com.epam.epamtask11;
import java.util.*;
import java.util.stream.IntStream;
public class Palindrome {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter number of strings : ");
			int n=in.nextInt();
			String s[]=new String[n];
			for(int i=0;i<n;i++) {
				s[i]=in.next();
				boolean c=isPalindrome(s[i]);
				if(c==true) {
					System.out.println(s[i]+" is palindrome.");
				}
				else
					System.out.println(s[i]+" is not a Palindrome. ");
			}
		}
		static boolean isPalindrome(String s) {
			
			String temp=s.replaceAll("\\s+","").toLowerCase();
	
			boolean t=IntStream.range(0,temp.length()/2).noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1));
			return t;
		}
	}

