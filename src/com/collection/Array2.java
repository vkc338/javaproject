package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Array2 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		int a[]=new int [4];
		int i=0;
		List list=new ArrayList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		Iterator itr=list.iterator();
		while(itr.hasNext())	
		{
			a[i]=(int)itr.next();
			i++;
		}
		for( i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
