package stream;

import java.util.ArrayList;
import java.util.List;


public class Empstream {
	
	public static List<Employee> getall(){
		List<Employee> lst=new ArrayList<>();
		lst.add(new Employee(100,"Prem","IT",24000));
		lst.add(new Employee(101,"Pratik","Admin",28000));
		lst.add(new Employee(102,"Pragati","HR",29080));
		lst.add(new Employee(103,"Mangla","HR",32000));
		lst.add(new Employee(104,"Manoj","CEO",47000));
		lst.add(new Employee(105,"Viaan","HR",89000));
		return lst;
		
	}
	
	

}
