package com.cru.reprtgen;

import java.util.Comparator; 
import java.util.List; 

public class getRollNumber implements Comparator {
	public int compare(Student s1, Student s2) 
	{
		
		return s2.getTotal()-s1.getTotal();
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
