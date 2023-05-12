package corejava;

public class TestEmployee
{

	public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1001, 50000);
        employee.displayDetails();

        Manager manager = new Manager("Jane Smith", 1002, 75000, "Sales");
        manager.displayDetails();

        Clerk clerk = new Clerk("Bob Johnson", 1003, 30000, 40);
        clerk.displayDetails();
}



	
}
