package corejava;
public class Clerk extends Employee{
	private int hoursWorked;

    public Clerk(String name, int id, double salary, int hoursWorked) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}


