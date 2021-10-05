package parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import stream.Employee;

public class EmpParallel {

	public static List<Employee> getall(){
		List<Employee> lst=new ArrayList<>();
		for(int i=1;i<=1000;i++) {
			lst.add(new Employee(i,"Emp"+i,"Admin"+i,Float.valueOf(new Random().nextInt(1000*100))));
		}
		return lst;
	}
}
