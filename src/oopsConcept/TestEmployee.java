package oopsConcept;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Dipak", 30, 7000000);
		System.out.println(emp.getEmployeeDetails());
		emp.setName("golu");
		System.out.println(emp.getEmployeeDetails());
	}

}
