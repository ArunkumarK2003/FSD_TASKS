package FSD_Practice;

class Aa {
	Aa(){
		this(5);
		System.out.println("A");
	}
	Aa(int a){
		super();
		System.out.println("A 1");
	}
}
class Bs extends Aa{
	Bs(){
		super(5);
		System.out.println("B");
	}
	Bs(int a){
		System.out.println("B 1");
	}
}
public class sup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bs b = new Bs(5);
	}

}
