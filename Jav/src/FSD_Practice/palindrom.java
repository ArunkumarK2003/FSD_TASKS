package FSD_Practice;
import java.util.*;
public class palindrom {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String reve=new StringBuilder (st).reverse().toString();
		if(st.equals(reve)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");

		}

	}

}
