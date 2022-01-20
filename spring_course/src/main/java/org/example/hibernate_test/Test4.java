package org.example.hibernate_test;

import org.example.hibernate_test.entity.Detail;
import org.example.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
     public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class)
                .buildSessionFactory();
         Session session = null;

        try {
            session = factory.getCurrentSession();
//            Employee emp = new Employee("Sergeant", "Shadwell", "Security", 200 );
//            Detail det = new Detail("London", "12323213", "sergeant@mail.ru");
//            emp.setEmpDetail(det);

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 3);
            session.delete(detail);
//            System.out.println(detail.getEmoloyee());
//            Employee cur = session.get(Employee.class, 2);


//            session.save(emp);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
