package corejava;

public class GraduateStudent extends Students {
	//Variable declaration
	private String Advisor;
	private String Thesistopic;
	

	//Creating parameterized constructors
	public GraduateStudent(String name, int age) {
		super("kalai", 19);
		this.Thesistopic=Thesistopic;
		this.Advisor=Advisor;
		
	}


//create a getter &setter for Advisor &Thesistopic
	public String getAdvisor() {
		return Advisor;
	}



	public void setAdvisor(String advisor) {
		Advisor = advisor;
	}



	public String getThesistopic() {
		return Thesistopic;
	}



	public void setThesistopic(String thesistopic) {
		Thesistopic = thesistopic;
	}
}