package leetcode.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Q690 {
	
	public int getImportance(List<Employee> employees, int id) {
		int sum = 0;
        Queue<Employee> q = new LinkedList<>();
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
        	map.put(employee.id, employee);
        }
        
        q.offer(map.get(id));
        
        while (!q.isEmpty()) {
        	Employee employee = q.poll();
        	sum += employee.importance;
        	
        	for (Integer num :employee.subordinates) {
        		q.offer(map.get(num));
        	}
        }
        
        return sum;
    }
	
	static class Employee {
	    public int id;
	    public int importance;
	    public List<Integer> subordinates;
	}
	
}
