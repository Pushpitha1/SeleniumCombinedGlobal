package practice;

import generics.JavaUtility;

public class Demorandom {
	public static void main(String[] args)  {
		JavaUtility javau=new JavaUtility();
		for(int i=1000;i<1200;i++)
		System.out.println(javau.generatingRandomNumbers(i));
	}
}
