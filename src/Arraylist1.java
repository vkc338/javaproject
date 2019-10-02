import java.awt.List;
import java.util.ArrayList;
public class Arraylist1 
{
	public static void main(String[] args) 
	{
		ArrayList list =new ArrayList();
		list.add(5);
		list.add(8);
		list.add(10);
		list.add("xyz");
		int val = (int)list.get(0);
				System.out.println(val);
				int val1 = (int)list.get(1);
				System.out.println(val1);
				int val2 = (int)list.get(2);
				System.out.println(val2);
		String s=(String)list.get(3);
		System.out.println(s);
		
	}
		
		
		
		
		
	
}
