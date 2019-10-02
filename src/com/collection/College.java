package com.collection;

import java.util.ArrayList;
import java.util.List;

public class College 
{
	public List m1()
	{
		Student s1=new Student();
		s1.setRollno(23);
		s1.setName("vijay");
		Student s2= new Student();
		s2.setRollno(56);
		s2.setName("vipin");
		List list= new ArrayList();
		list.add(s1);
		list.add(s2);
		return list;
	}

}
