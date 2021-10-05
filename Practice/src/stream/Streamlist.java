package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamlist {
	public static void main(String[] args) {
		
	
	List<String> lst=new ArrayList<>();
	lst.add("Prem");
	lst.add("Pratik");
	lst.add("Pragati");
	lst.add("Mangla");
	lst.add("Manoj");
	lst.add("Ankit");
	
	List<String> lst1=lst.stream().sorted().collect(Collectors.toList());
	System.out.println("All List Element");
	System.out.println(lst);
	System.out.println("**********************************************************************");
	System.out.println("Sorted List Element");
	System.out.println(lst1);
	List<String> lst2=lst.stream().filter(e->e.contains("Pr")).collect(Collectors.toList());
	System.out.println("**********************************************************************");
	System.out.println("List Element who contain Pr");
	System.out.println(lst2);
	List<String> lst3=lst.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
	System.out.println("**********************************************************************");
	System.out.println("List Element sorted in Reverse Order");
	System.out.println(lst3);
	
	System.out.println("**********************************************************************");
	
	List<String> lst11=Empstream.getall().stream().filter(e->e.getDept().equalsIgnoreCase("HR")).map(e->e.getEmpname()).collect(Collectors.toList());
	System.out.println("EMployee Belong To HR department");
	System.out.println(lst11);
	
	System.out.println("**********************************************************************");
	
	double sumsal=Empstream.getall().stream().map(e->e.getSalary()).mapToDouble(i->i).sum();
	System.out.println("Total Salary :"+sumsal);
	
	System.out.println("**********************************************************************");
	
	double avgsal=Empstream.getall().stream().map(e->e.getSalary()).mapToDouble(i->i).average().getAsDouble();
	System.out.println("Average Salary :"+avgsal);
	
	System.out.println("**********************************************************************");
	
	double maxsal=Empstream.getall().stream().map(e->e.getSalary()).max((x,y)->x.compareTo(y)).get();
	System.out.println("Maximum Salary :"+maxsal);
	
	double maxsal1=Empstream.getall().stream().map(e->e.getSalary()).mapToDouble(i->i).max().getAsDouble();
	System.out.println("Maximum Salary :"+maxsal1);
	
	System.out.println("**********************************************************************");
	
	double minsal=Empstream.getall().stream().map(e->e.getSalary()).min((x,y)->x.compareTo(y)).get();
	System.out.println("Minimum Salary :"+minsal);
	
	
	
	
	double minsal1=Empstream.getall().stream().map(e->e.getSalary()).mapToDouble(i->i).min().getAsDouble();
	System.out.println("Minimum Salary :"+minsal1);
	
	System.out.println("**********************************************************************");
	
	
	
	}
}
