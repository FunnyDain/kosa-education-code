package emp;

import java.util.Iterator;

public class Company {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke",1,"Secretary",800);
		emp[1] = new Sales("Tuxi",2,"Sales",1200);
		
		printEmployee(emp, false);
		
		System.out.println("\n[인센티브 100지급]");

	}

	
	public static void printEmployee(Employee[] emp, boolean isTax) {	
		
		System.out.println("name\tdepartment\tsalary\t" + (isTax == true ? "extra pay" : " "));
		System.out.println("--------------------------------------------");
		
		String str = "";
		for (Employee e : emp) {
			
		}
		System.out.println(str);
		//instanceof 객체 사용하기
		
	}

}
