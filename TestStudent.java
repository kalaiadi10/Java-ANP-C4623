package corejava;

public class TestStudent {

	public static void main(String[] args) {
		//creating object of class student
		Student a=new Student();
		//object is used to access the method of the class
		a.setId(1);
		a.setName("kalai");
		a.setAge(19);
		System.out.println("StudentId:"+a.getId()+"\n"+"StudentName:"+a.getName()+"\n"+"Studentage:"+a.getAge());
	
	

	}

}
