package corejava;

public class InheritClass {
	
		public static void main(String[] args)
		{
			//Creating an object
			GraduateStudent g = new GraduateStudent ("kalai", 19);
			// using object Setting the values
			g.setName("kalai");
			g.setAge(19);
			g.setId(51);
			g.setMajor(" BSC IT");
			g.setAdvisor("Professor ");
			g.setThesistopic("WebApplication");
			//Getting the values
			System.out.println("Name:"+g.getName()+"\n"+"Age:"+g.getAge()+"\n"+"Id:"+g.getId()+"\n"+"Major:"+g.getMajor()+"\n"+"Advisor:"+g.getAdvisor()+"\n"+"Thesistopic:"+g.getThesistopic());
			
		}

	}



