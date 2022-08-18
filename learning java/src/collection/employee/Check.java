package collection.employee;

import java.util.ArrayList;
public class Check {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setEmpname("lokesh");
		e1.setEmpdep("development");
		e1.setPhonenumber("8220197576");
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setEmpname("Gowtham");
		e2.setEmpdep("devops");
		e2.setPhonenumber("9955887744");
		
		Employee e3 = new Employee();
		e3.setEmpid(3);
		e3.setEmpname("anand");
		e3.setEmpdep("development");
		e3.setPhonenumber("7755993300");
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		al.forEach(num -> System.out.println(num));
		for(Employee d : al) {
			if(d.getEmpdep().equals("development")) {
				System.out.println(d.getEmpname());
			}
		}
		
		
		
	}

}
