package corejava;

public class TestStudent {

	public static void main(String[] args) {
		//creating object of class student
		Student a=new Student();
		//object is used to access the method of the class
		a.setId(1);
		a.setName("kalai");
		a.setAge(19);
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName()+"\n"+"age:"+a.getAge());
	
	

	}

}
