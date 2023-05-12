package corejava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		//create scanner class to take input from users
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0; 
		int temp;
		while(num>0) {
			temp=num%10; //taking single digit from the num using modulus operator
			sum=sum+temp; //adding that single digit to a new variable with value 0
			num=num/10;	  //dividing the num by 10 to get remaining digits
		}
		System.out.println("Sum of Digits:"+sum);
	}

}