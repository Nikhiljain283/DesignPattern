package facadeDesignPattern;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

public class FacadePattern {

	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print(" Mobile Shop");
			System.out.print("1. IPHONE.");
			System.out.print("2. SAMSUNG.");
			System.out.print("3. BLACKBERRY.");
			System.out.print("4. Exit.");
			System.out.print("Enter your choice: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			ShopKeeper sk = new ShopKeeper();

			switch (choice) {
			case 1: {
				sk.iphoneSale();
			}
				break;
			case 2: {
				sk.samsungSale();
			}
				break;
			case 3: {
				sk.blackberrySale();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (choice != 4);
	}

}
