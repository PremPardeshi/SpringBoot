package parallel;

import java.util.stream.Collectors;

public class ParaStream {
	public static void main(String[] args) {
		long start, end = 0;

		
		System.out.println("***************************************************");
		
		start = System.currentTimeMillis();
		int min2 = EmpParallel.getall().stream().map(e -> e.getEmpid()).max((x,y)->x.compareTo(y)).get();
		end = System.currentTimeMillis();
		System.out.println("min  :"+min2);
		System.out.println("Total time :"+(end-start));
		System.out.println("***************************************************");
		
		start = System.currentTimeMillis();
		int min1 = EmpParallel.getall().parallelStream().map(e -> e.getEmpid()).max((x,y)->x.compareTo(y)).get();
		end = System.currentTimeMillis();
		System.out.println("MIN   :"+min1);
		System.out.println("Total time :"+(end-start));
		System.out.println("***************************************************");
		
		
		start = System.currentTimeMillis();
		double sum=EmpParallel.getall().stream().collect(Collectors.summingDouble(e->e.getSalary()));
		end = System.currentTimeMillis();
		System.out.println("sum1  :"+sum);
		System.out.println("Total time :"+(end-start));
		System.out.println("***************************************************");
		start = System.currentTimeMillis();
		double sum1=EmpParallel.getall().parallelStream().collect(Collectors.summingDouble(e->e.getSalary()));
		end = System.currentTimeMillis();
		System.out.println("sum2  :"+sum1);
		System.out.println("Total time :"+(end-start));
	}

}
