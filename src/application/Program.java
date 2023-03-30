package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.println("Number: ");
			int number = sc.nextInt();
			System.out.println("Holder: ");
			String Holder = sc.next();
			sc.nextLine();
			System.out.println("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.println("withdraw Limit: ");
			Double withDrawLimit = sc.nextDouble();
			
			Account account = new Account(number, Holder, balance, withDrawLimit);
		
			System.out.println("Enter amount for withdraw");
			Double withDraw = sc.nextDouble();
			account.withdraw(withDraw);
			System.out.println("New balance: " + account.getBalance());;
		}catch(DomainException e) {
			System.out.println("Error in with Draw " + e.getMessage());;
		}
		
		sc.close();
	}

}
