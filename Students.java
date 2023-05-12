package corejava;
//creating a child class inherits the Parent 
public class Students extends Person  {
	//Variable declaration
	private int Id;
	private String Major;
	
//Creating parameterized constructors
	public Students(String name, int age) {
		super("kalai", 5);
		this.Id=Id;
		this.Major=Major;
	}
//Calling getter&setters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}
	

}
