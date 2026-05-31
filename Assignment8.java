package practice;

abstract class Institute{//parent class
	abstract void fullStack();//abstract mtd(no body)
	
    void st() {//concrete mtd(with body)
		System.out.println("software testing available");
	}
}

class Course extends Institute{//child class
	void fullStack() {
		System.out.println("fullstack java");
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Course co = new Course();//creating object with child class
		co.fullStack();
		co.st();
	}

}
//output
//fullstack java
//software testing available