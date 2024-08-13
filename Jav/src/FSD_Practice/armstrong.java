package FSD_Practice;
import java.util.*;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0,temp=a;
		while(temp!=0) {
			int dig=temp%10;
			sum+=dig*dig*dig;
			temp/=10;
		}
		System.out.println(a==sum?"It is an armstrong number":"Not an armstrong number");
	}

}
