package FSD_Practice;
class car{
	void BMW() {
		System.out.println("I have two BMW");
	}
	void Benz() {
		System.out.println("Simply Waste");
	}
}
class engine extends car{
	void petrol() {
		System.out.println("High Performance");
	}
	void diesel() {
		System.out.println("Higher efficiency");
	}
}
class type extends car{
	void sedan() {
		System.out.println("Sedan");
	}
	void coupe(){
		System.out.println("Coupe");
	}
}
public class inheritance_hira {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		type ca=new type();
		int arr[]=new int[5];
		engine en=new engine();
		ca.BMW();
		ca.Benz();
		en.diesel();
		
		en.petrol();
		ca.sedan();
		ca.coupe();
	}

}
