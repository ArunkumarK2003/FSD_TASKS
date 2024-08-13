package FSD_Practice;
import java.util.*;
class Bank
{
	String Account_Number;
	String Account_Holder_Name;
	double balance;
	
	Bank (String account_number,String name,double balance)
	{
		this.Account_Number=account_number;
		this.Account_Holder_Name=name;
		this.balance=balance;
	}
	
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("After Deposit : "+balance);
	}
	
	void withdraw(double amount)
	{
		balance-=amount;
		System.out.println("After Withdraw : "+balance);
	}
	
	void display()
	{
		System.out.println("Account Number : "+Account_Number);
		System.out.println("Account Holder Name : "+Account_Holder_Name);
		System.out.println("Account Balance : "+balance);
	}
}
public class Bank_Details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank a=new Bank("19345632","Arun",50000.0);
		a.display();
		System.out.println();
		a.deposit(10000);
		System.out.println();
		a.withdraw(15000);
	}

}