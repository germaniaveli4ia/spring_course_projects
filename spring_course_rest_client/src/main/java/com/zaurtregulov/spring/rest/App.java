package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);
//        System.out.println(communication.getEmployee(1));
//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 700);
//        employee.setId(12);
//        communication.saveEmployee(employee);
        communication.deleteEmployee(12);

    }
}
