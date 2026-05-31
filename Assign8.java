package practice;

interface Employee{//interface class with abstract mtd
	void performTask();
	int getSalary();
}

class Manager implements Employee{//implement the interface
	public void performTask() {
		System.out.println("employee task");
	}
	public int getSalary() {
		System.out.println("employee salary ");
		return 80000;
	}
	void assignTask() {
		System.out.println("manager assign task to employee");
	}
}

public class Assign8 {

	public static void main(String[] args) {
		Manager ma = new Manager();
		ma.performTask();
		ma.assignTask();
		System.out.println(ma.getSalary());
	}

}
//employee task
//manager assign task to employee
//employee salary
//80000