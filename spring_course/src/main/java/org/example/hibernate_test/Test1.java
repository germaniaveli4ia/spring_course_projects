package org.example.hibernate_test;

import org.example.hibernate_test.entity.Detail;
import org.example.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
     public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class)
                .buildSessionFactory();
         Session session = null;

        try {
            session = factory.getCurrentSession();
//            Employee emp = new Employee("Lolka", "Kekka", "Circus", 1);
//            Detail det = new Detail("Durka", "111111", "lolka@d.com");
//            emp.setEmpDetail(det);
            session.beginTransaction();
            Employee cur = session.get(Employee.class, 2);
            session.delete(cur);
//            System.out.println(cur.getEmpDetail());
//            session.save(emp);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
