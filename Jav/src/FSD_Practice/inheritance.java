package FSD_Practice;
class two{
	void NoOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends two{
	void brand() {
	System.out.println("Brand is BMW");
}
}
class royal extends Bike{
	void dis() {
		System.out.println("Continental-650");
	}
}
public class inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		royal bike=new royal();
		bike.NoOfWheels();
		bike.brand();
		bike.dis();
	}
}
