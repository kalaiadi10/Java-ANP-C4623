package corejava;

public class Person 
{
//Variable declaration
	private String name;
	private int age;
	
	
//creating parameterized constructor for name & age
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	


	//	creating getters and setters
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}



