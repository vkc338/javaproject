package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class India 
{
	public static void main(String[] args) 
	{
		List mh=new ArrayList();
		mh.add("pune");
		mh.add("mumbai");
		mh.add("jalgaov");
		
		List up=new ArrayList();
		up.add("varanasi");
		up.add("Mathura");
		up.add("Jaunpur");
		
		List india= new ArrayList();
		india.add(mh);
		india.add(up);
		
		Iterator itr=india.iterator();
		while(itr.hasNext())
		{
			List li = (List)itr.next();
			
			if(li == up)
			{
				Iterator itr1 = li.iterator();
				while(itr1.hasNext())
				{
					String x= (String)itr1.next();
					System.out.println(x);
				}
			}
		}
	}
}
