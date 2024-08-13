package FSD_Practice;
class A{
	int a=10;
	A(String name){
		System.out.println("Welcome "+name);
	}
	void method1() {
		System.out.println("I am super class method");
	}
}
class B extends A{
	B() {
		super("Arun");
	}
	void method2() {
		System.out.println("Super Class Variable:"+super.a);
		super.method1();
	}
}
public class supe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.method2();
	}

}
