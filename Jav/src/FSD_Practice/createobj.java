package FSD_Practice;
import java.util.*;
public class createobj {
	String name;int age;
	public createobj(String name,int age) {
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createobj obj=new createobj("Arun",21);
		System.out.println("Name:"+obj.name);
		System.out.println("Age:"+obj.age);	
	}

}
