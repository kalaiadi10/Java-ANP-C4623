package corejava;
import java.util.Scanner;

public class PrimeDoWhile {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int num;
	        do {
	            System.out.print("Enter a number: ");
	            num = input.nextInt();
	        } while (num < 2);//check
	        boolean isPrime = true;
	        for (int i = 2; i <= Math.sqrt(num); i++)
	        //method srt use method to number multiple
	        	{
	            if (num % i == 0)//remainder parts check
	            	{
	                isPrime = false;
	                break;//out of loop 
	            }
	        }
	        if (isPrime)//if true to  print prime
	        	{
	            System.out.println("Prime");
	        } else {
	            System.out.println("Not prime");
	        }
	    }
	}
//if 0 is coming is  not prime no.
		