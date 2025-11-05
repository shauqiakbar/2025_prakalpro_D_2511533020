package pekan6_2511533020;

import java.util.Scanner;

public class PerulanganWhile1_2511533020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		String jawab;
		boolean running = true;
		 //deklrasi scanner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+counter);
			System.out.print("Apakah lanjut (ya / tidak?");
			jawab = scan.nextLine ();
			if (jawab.equalsIgnoreCase("tidak")) {
				running= false;
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+" kali");
	}

}
