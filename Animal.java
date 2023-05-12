package corejava;
//parent class
 class Animal 
 {

	//method
	 public void display()
	 {
		 System.out.println("Inside parent class");

	}

}
 //child class
class Dogs extends Animal 
 {
public void sound()
	{
		System.out.println("Barks,,, ");
	}
 }
class Puppy extends Dogs
{
	public void run() {
		System.out.println("He runs by small steps");
	}
}
// main class
class Tester{
	public static void main(String[] args)
	{
		//create an object of  CHILD class
		
		Puppy d= new Puppy();
		d.display();
		d.sound();
		d.run();
	}
	
}