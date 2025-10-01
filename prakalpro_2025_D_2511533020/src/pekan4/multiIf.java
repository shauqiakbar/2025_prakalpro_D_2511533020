package pekan4;

import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int umur;
		char sim;
		Scanner a= new Scanner(System.in);
		System.out.print("Input Umur Anda: ");
		umur= a.nextInt();
		System.out.print("Apakah Anda Sudah Puny3a Sim C: ");
		sim=a.next().charAt(0);
		a.close();
			if ((umur >= 17) && (sim=='y')) {
				System.out.println("Anda Sudah Dewasa dan Boleh Membawa Motor");
			}
			if ((umur >= 17) && (sim!='y')) {
				System.out.println("Anda Sudah Dewasa Tetapi Tidak Boleh Membawa Motor");
			}
			if ((umur < 17) && (sim!='y')) {
				System.out.println("Anda Belum Cukup Umur Bawa Motor");
        	}
			if ((umur < 17) && (sim=='y')) {
				System.out.println("Anda Belum Cukup Umur Punya SIM");
			}
	}
}
