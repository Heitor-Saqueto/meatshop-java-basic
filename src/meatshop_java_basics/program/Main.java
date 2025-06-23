package meatshop_java_basics.program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import meatshop_java_basics.entities.Product;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
				
		while(true) {
			System.out.println("\n ==== Meat Shop Menu ====");
			System.out.println("1. Add product");
			System.out.println("2. List products");
			System.out.println("3. Search product by name");
			System.out.println("0. Exit");
			
			int option = -1;
			
			try {
			System.out.print("Option: ");
			
		
			option = sc.nextInt();
			sc.nextLine(); // clear buffer
			
			}catch(InputMismatchException e) {
				System.out.println("❌ Invalid input");
				sc.nextLine();
				continue;
			}
			if(option == 1) {
				try {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.println("Meat Type:");
				String meatType = sc.nextLine();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Code: ");
				int code = sc.nextInt();
				sc.nextLine();
				
				Product p = new Product(name, meatType, price, code);
				products.add(p);
				System.out.println("------------------------");
				System.out.println("✅ Product add!");
				System.out.println("------------------------");
				
				}catch(InputMismatchException e) {
					System.out.println("❌ Invalid input");
					sc.nextLine();
				}
			}else if(option == 2) {
				for(Product p : products) {
					System.out.println(p);
				}
				if(products.isEmpty()) {
					System.out.println("------------------------");
					System.out.println("⚠️ No products registered");
					System.out.println("------------------------");
				}
			}else if(option == 3) {
				System.out.println("------------------------");
				System.out.println("Enter name to search: ");
				String search = sc.nextLine();
				
				for(Product p: products) {
					if(p.getName().toLowerCase().contains(search.toLowerCase())) {
						System.out.println(p);
					}
				}
			}else if(option == 0) {
				System.out.println("------------------------");
				System.out.println("------Bye-Bye-----------");
				System.out.println("------------------------");
				break;
				
			}else {
				System.out.println("------------------------");
				System.out.println("Invalid option. ");
				System.out.println("------------------------");
			 }
			}
		sc.close();
		}

	}

