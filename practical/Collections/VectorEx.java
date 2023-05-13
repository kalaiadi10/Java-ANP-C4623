package Collections;


import java.util.*;

public class VectorEx {

	public static void main(String[] args)
	{
		Vector<String> vtr=new Vector<String>();
		
		//Adding object in ArrayList
		vtr.add("telephone");
		vtr.add("mobilephone");
		vtr.add("smartphone");
		vtr.add("earphone");
		
		//traversing list through iterator
		Iterator itr=vtr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
