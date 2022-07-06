
public class Employee {
	public String name;
	public int joinYear;
	public double salary;

	public Employee() {

	}

	public Employee(String name, int joinYear, double salary) {
		this.name = name;
		this.joinYear = joinYear;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", joinYear=" + joinYear + ", salary=" + salary + "]";
	}

}