package inheritence_join_table;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) {
		
	
	Session session=HibernateUtil.getsessionFactory().openSession();
	
	Akurdi ak= new Akurdi();
	ak.setSid(205);
	ak.setName("VIPN");
	ak.setAddress("PUNE");
	ak.setWeekendBatchno("B100");
	
	Karvenagar kr= new Karvenagar();
	
	kr.setSid(227);
	kr.setName("VIJAY");
	kr.setAddress("MUMBAI");
	kr.setRegularBatchno("A99");
	session.save(ak);
	session.save(kr);
	session.beginTransaction().commit();
}
}