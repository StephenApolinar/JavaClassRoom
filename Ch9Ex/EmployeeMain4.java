// Uses polymorphism to give the same output as 
// EmployeeMain3.java

public class EmployeeMain4 {
	public static void main(String[] args) {
		Employee[] employees = {new Employee(), new Lawyer(), new Secretary(), new LegalSecretary()};

		// print information about each employee
		for (Employee e : employees) {
			System.out.print(e.getHours() + ", ");
			System.out.printf("$%.2f, ", e.getSalary());
			System.out.print(e.getVacationDays() + ", ");
			System.out.print(e.getVacationForm() + ", ");
			System.out.println(e); // calls toString
		}
	}
}
