package FSD_Practice;
class Animal1{
	void makesound1() {
		System.out.println("Sound Making...");
	}
}
class dog1 extends Animal1{
	void cat() {
		System.out.println("Barking");
	}
}

public class animal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog1 bark=new dog1();
		bark.makesound1();
		bark.cat();
	}

}
