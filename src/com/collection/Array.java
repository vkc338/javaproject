package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Array 
{
	public static void main(String[] args) 
	{
	
	int a[]= {1,2,3,4};
	
	List list=new ArrayList();
	for(int i=0;i<a.length;i++)
	{
		list.add(a[i]);
	
	}
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		int i=(int)itr.next();
		System.out.println(i);
	}
	}
}
