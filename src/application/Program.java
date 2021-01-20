package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("\nRent #" + i + ": ");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {

				System.out.println(i + ": " + vect[i].toString());
				
			}
		}
		
		
		
		sc.close();
	}
}