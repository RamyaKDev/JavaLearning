package com.collection;

import java.util.Comparator;

public class Employee {
 int eid;
 String ename;
public Employee(int eid, String ename) {
	
	this.eid = eid;
	this.ename = ename;
}
public String toString() {
	return ename+" "+eid;
	
}




 
}
class EmpId implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1=(Employee) o1;
		Employee emp2=(Employee) o2;
		if(emp1.eid>emp2.eid)
			return 1;
		else if(emp1.eid<emp2.eid)
			return -1;
		else
		return 0;
	}
}
	class EmpName implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Employee emp1=(Employee) o1;
			Employee emp2=(Employee) o2;
			
			return emp1.ename.compareTo(emp2.ename);
		}
	
	}

