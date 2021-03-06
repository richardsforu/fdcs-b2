package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.employee.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee e1 = new Employee(10, "Praveem", 12000);
		Employee e2 = new Employee(11, "James", 5000);
		Employee e3 = new Employee(12, "Ruth", 15000);
		Employee e4 = new Employee(13, "Ella", 21000);
		Employee e5 = new Employee(14, "Goedic", 7900);
		Employee e6 = new Employee(15, "Wall", 3000);

		Department dept = new Department();
		dept.setDeptId(1024);
		dept.setDeptName("HR");
		dept.setLoc("Mumbai");

		e1.setDept(dept);
		e2.setDept(dept);
		e3.setDept(dept);
		e4.setDept(dept);
		e5.setDept(dept);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
