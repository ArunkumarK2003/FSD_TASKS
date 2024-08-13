package FSD_Practice;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),count=1;
		for(int i=1;i<a;i++){
		    if(a%i==0){
		        count++;
		    }
		}
		if(count==2){
		    System.out.println("prime");
		}
		else{
		    System.out.println("Not prime");
		}
	}

}
