package com.prince.predicateEx;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManage {

	public static void main(String[] args) {
		
		ArrayList<Employee> alist = new ArrayList<>();
		
		populate(alist);
		
		Predicate<Employee> p = emp->emp.designation.equals("Developer");
		
		System.out.println("Developer information");
		
		display(p ,alist);
		
		Predicate<Employee> p2 = emp->emp.city.equals("Hyderabad");
		
		display(p2, alist);
		
		Predicate<Employee> p3 = emp->emp.salary<40000 ;
		
		display(p3, alist);
		
		System.out.println("Find Developer who must be in Hyderabad");
		display(p.and(p2), alist);
				
		System.out.println("Select Employee who are Engineer or salary less then 40000");
		
		display(p.or(p3), alist);
		
	System.out.println("All Employee who are not Developer");
		
		display(p.negate(),alist);
		
	}	
		public static void populate(ArrayList<Employee> alist){
		 alist.add(new Employee("kiran","Developer",30000,"Hyderabad"));
		alist.add(new Employee("shekar","Engineer",25000,"Chennai"));
		alist.add(new Employee("mallika", "Developer", 25000, "Banglore"));
		alist.add(new Employee("sowmya", "Developer", 40000, "Hyderabad"));
		}
		
		public static void display(Predicate<Employee> p, ArrayList<Employee> list){
			
			for(Employee e : list){
				
				if(p.test(e)){
					
					System.out.println(e);
				}
			}
			
			System.out.println("==================================================");
		}
		
	}

