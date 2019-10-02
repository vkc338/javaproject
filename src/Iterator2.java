import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator2 
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(12);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
		}
	}

}
