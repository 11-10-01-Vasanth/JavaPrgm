package proj;

class A {
	private String empName;
	private int empId;

	void setEmpNameId(String n, int id) {
		empName = n;
		empId = id;
	}

	String getEmpName() {
		return empName;
	}

	int getEmpId() {
		return empId;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		A a = new A();
		a.setEmpNameId("Vasanth", 55);
		System.out.println("Name : " + a.getEmpName());
		System.out.println("Id   : " + a.getEmpId());
	}

}
