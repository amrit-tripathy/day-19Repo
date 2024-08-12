package com.grayMatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("jdbc-bean.xml");
        EmployeeDao dao=(EmployeeDao) context.getBean("empdao");
        int count = dao.addEmployee(new Employee("1","user1","7888"));
        if(count==1) {
        	System.out.println("row added");
        } else {
        	System.out.println("ERROR: did not add the record to db;");
        }
        
    }
}
