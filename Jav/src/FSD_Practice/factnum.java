package FSD_Practice;
import java.util.*;
public class factnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		long fact =1;
		for (int i=1;i<=n;i++) {
			fact = fact*i;		
		}
		System .out.print(fact);
		sc.close();
	}

}
