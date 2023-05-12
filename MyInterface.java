package corejava;

interface MyInterface
{
public void doSomething(); //interface method ()without body
}
class Myclass implements MyInterface
{
	public void doSomething() 
	{
		System.out.println("Doing Something");
	}
}
class Mymain{
	public static void main(String[] args)
	
	{
		 Myclass m=new  Myclass();
		m.doSomething() ;
	}
}
