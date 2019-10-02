import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator4 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		list.add(5);
		list.add("vipin chauhan");
		list.add(8);
		list.add("Laxmi chauhan");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
			else if(o instanceof Integer)
			{
				int x=(int)o;
			}
		}
		
	}
	
}
