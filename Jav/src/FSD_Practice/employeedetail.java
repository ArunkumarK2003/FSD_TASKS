package FSD_Practice;

public class employeedetail {
	String name,jobtitle;
	int salary;
	employeedetail(String name,String jobtitle,int salary){
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	void disp() {
		System.out.println("Name:"+name+" | Job Role:"+jobtitle+" | Salary:"+salary);
	}
	public void raise(double perc) {
		if(perc>0) {
			double inc=salary*(perc/100);
			salary+=inc;
			System.out.println(perc);
		}
		else {
			System.out.println("enter salary amount should be positive");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeedetail emp = new employeedetail("Arun", "Security Authority", 100000);
		System.out.println("Employee Details:");
		emp.disp();
		emp.raise(6);
		System.out.println("After salary increased:");
		emp.disp();
	}

}
