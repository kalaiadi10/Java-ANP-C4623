
package Collections;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) 
	{
		LinkedList<String> lnd=new LinkedList<String>();
		
		//Adding object in ArrayList
		lnd.add("car");
		lnd.add("bike");
		lnd.add("cycle");
		lnd.add("bullock-cart");
		
		//traversing list through iterator
		Iterator itr=lnd.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
