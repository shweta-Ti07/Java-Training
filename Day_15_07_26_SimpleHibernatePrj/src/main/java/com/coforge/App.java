package com.coforge;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.entities.Employee;

//assignment: convert this app into menu driven using static methods 
//ex; public static List<Employee> getAllEmployees(){ write code here  }
public class App {
	
	
	
    public static void main(String[] args) {
        
    	
    	SessionFactory factory=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	//addEmployee
//    	Employee e1=new Employee();
//    	e1.setEname("Amit");
//    	e1.setSalary(75000);
//    	session.persist(e1);
//    	transaction.commit();
//    	
    	
    	
    	
    	//update Employee
    	
//    	int id=127;
//    	Employee emp=session.get(Employee.class, id);
//    	if(emp!=null) {
//    		emp.setEname("krithi");
//    		emp.setSalary(95000);
////    		session.update(emp);
//    		transaction.commit();
//    	}
//    	else
//    		System.out.println("No employee with this id to update");
    	
    	
    	int id=128;
    	Employee emp=session.get(Employee.class, id);
    	if(emp!=null) {
    		session.remove(emp);
    		System.out.println("employee deleted");
    		transaction.commit();
    	}
    	else
    		System.out.println("No employee with this id to delete");
    	
    		//getAllEmployees
    	List<Employee> empList=new ArrayList<Employee>();
    	empList=session.createSelectionQuery("from Employee",Employee.class).getResultList();
    	for(Employee e:empList)
    		System.out.println(e);
    	
    	//getEmployeeById
//    	int id=130;
//    	Employee getEmp=session.get(Employee.class,id);
//    	if(getEmp!=null)
//    		System.out.println("Selected Employee : "+getEmp);
//    	else
//    		System.out.println("No Employee exists with thid id : "+id);
//    	
    	session.close();
    	factory.close();
    	
    	
    }
}
