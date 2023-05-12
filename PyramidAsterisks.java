package corejava;
import java.util.Scanner;

public class PyramidAsterisks {
	public static void main(String args[]) 
	{
		//create scanner class to take input from users
		Scanner sc = new Scanner(System.in);

        
        int rows = 5; // number of stars
        // 1st for loop for rows
        for(int i = 1; i <=rows ; ++i){
            
            // 2nd for loop for printing stars
            for(int j = 1; j <= i; ++j){
                System.out.print("* ");
            }
           System.out.println();
        }
	}
}
	