package hibernateinheritancebydefault;

import org.hibernate.Session;

public class SingleTableTest 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getsessionFactory().openSession();
		
		School sc= new School();
		sc.setRollno(1);
		sc.setName("vipin");
		sc.setAddress("pune");
		sc.setRegularbatch("A-101");
		School sc1= new School();
		sc1.setRollno(2);
		sc1.setName("xyz");
		sc1.setAddress("abc");
		sc1.setRegularbatch("B-102");
		
		Tuition t=new Tuition();
		t.setRollno(3);
		t.setName("qwet");
		t.setAddress("qaz");
		t.setWeekendbatch("C-103");
		
		Tuition t1=new Tuition();
		t1.setRollno(4);
		t1.setName("xyza");
		t1.setAddress("qazaga");
		t1.setWeekendbatch("D-104");
		session.save(sc);
		session.save(sc1);
		session.save(t);
		session.save(t1);
		session.beginTransaction().commit();
		
		
	}
}
