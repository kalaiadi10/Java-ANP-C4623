package corejava;

public class Cat extends Dog
{
	//Variable declaration
	private int age;

	//creating parameterized constructor
	public Cat(int age) {
		super(age);
		this. age = age;
	}
	
	////using tostring method for override 
	@Override
	public String toString() {
		return "Cat [Age=" + age + "]";
	}

}