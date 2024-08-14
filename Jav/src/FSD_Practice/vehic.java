package FSD_Practice;
class vehicle{
	void drive() {
		System.out.println("We can able to drive a car");
	}
}
class car3 extends vehicle{
	void driv() {
		System.out.println("Repairing a car");
	}
}
public class vehic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car3 obj=new car3();
		obj.driv();
	}

}
