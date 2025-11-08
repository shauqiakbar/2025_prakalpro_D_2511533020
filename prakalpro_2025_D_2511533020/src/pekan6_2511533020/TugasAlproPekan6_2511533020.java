package alprotugas;
import java.util.*;
public class TugasAlproPekan6_2511533020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int percobaan = 0; // 

        while (true) {
            int dadu1 = rand.nextInt(6) + 1; 
            int dadu2 = rand.nextInt(6) + 1;
            int hasil = dadu1 + dadu2;
            percobaan++;

            System.out.print(dadu1 + " + " + dadu2 + " = ");
            int tebakan = input.nextInt();

         
            if (tebakan == hasil && hasil == 7) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda Menang setelah " + percobaan + " percobaan");
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
            }

           
            System.out.print("Apakah mau lempar dadu  (ya / tidak)? ");
            String jawab = input.next();

            if (!jawab.equalsIgnoreCase("ya")) {
                System.out.println("Anda Gagal Menang");
                break;
            }
        }
    }
}