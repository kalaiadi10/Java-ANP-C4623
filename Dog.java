package corejava;

public class Dog {
	private int age;
//creating parameterized constructor
	public Dog(int age) {
		super();
		this.age = age;
	}
//using tostring method for override 
	@Override
	public String toString() {
		return "Dog [Age=" + age + "]";
	}
	
	

}
