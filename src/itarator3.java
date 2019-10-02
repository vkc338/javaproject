import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itarator3 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		list.add("vipin");
		list.add("Laxmi");
		list.add("chauhan");
		
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
	}

}
