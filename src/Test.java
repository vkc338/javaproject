import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		Student s1=new Student();
		s1.setRollno(33);
		s1.setName("vipin kumar chauhan");
		Student s2=new Student();
		s2.setRollno(45);
		s2.setName("Laxmi chauhan");
		
		list.add(s1);
		list.add(s2);
		Iterator itr= list.iterator();
		while(itr.hasNext())	
		{
		Student stu=(Student)itr.next();
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		}
	}
}

