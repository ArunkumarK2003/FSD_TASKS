package FSD_Practice;
import java.util.*;
public class person {
	String str;
	int age;
	public person(String str,int age) {
		this.str=str;
		this.age=age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		person strs=new person("Arun",22);
		System.out.print("Object was created:"+strs.str);
		System.out.print(","+strs.age);
		s.close();
		
	}

}
