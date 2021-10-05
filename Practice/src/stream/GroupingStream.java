package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStream {

	public static void main(String[] args) {
		Map<Object, List<Employee>> lst=Empstream.getall().stream().collect(Collectors.groupingBy((e)->e.getDept().equals("HR")));
		System.out.println(lst);
		
		Map<Object, List<Object>> name=Empstream.getall().stream().collect(Collectors.groupingBy(e->e.getDept().equals("HR"),Collectors.mapping(e->e.getEmpname(),Collectors.toList())));
		System.out.println(name);
		
		Map<Object, Long> count=Empstream.getall().stream().collect(Collectors.groupingBy(e->e.getDept().equals("HR"),Collectors.counting()));
		System.out.println(count);
	}
}
