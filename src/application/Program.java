package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		double saldo = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("\nEnter account number: ");
		int acn = sc.nextInt();
		sc.nextLine();
		
		System.out.print("\nEnter account holder: ");
		String titular = sc.nextLine();
		
		System.out.print("\nIs there a initial depósit (s/n)? ");
		String opc = sc.nextLine();
		
		if(opc .equals("s")) {
			System.out.print("\nEnter a inicial deposit value: ");
			saldo = sc.nextDouble();
			sc.nextLine();
		}
		
		Conta c = new Conta(acn,titular,saldo);
		
		System.out.println("\n\nAccount data: " );
		System.out.println(c);
		
		System.out.print("\n\nEnter a deposit value: ");
		c.deposito(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(c);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		c.saque(sc.nextDouble());
		System.out.println("\nUpdated account data: \n");
		System.out.println(c);
		

	}

}
