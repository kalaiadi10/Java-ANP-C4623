package employee.dao;
import java.util.List;

import employee.main.Employee;


public interface IEmployee 
{
void saveData(Employee staff);
	
	void updateData(Employee staff);
	
	Employee getEmployeeDetail(int id);
	
	List <Employee> getalldata();
	
	void deleteData(Employee staff);
	
	double incrementSalary(int id, double percent);
	

}



	

