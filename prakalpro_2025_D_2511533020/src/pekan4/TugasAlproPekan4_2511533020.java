package pekan4;
import java.util.Scanner;
public class TugasAlproPekan4_2511533020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Deklarasi variabel
        String nama;
        double berat;
        int jarak, layanan, jenis;
        double biayaDasar = 0, biayaBerat = 0, biayaJarak = 0, biayaJenis = 0;
        double subtotal, biayaLayanan1, totalSebelumDiskon, diskon = 0, totalAkhir;

        // Input data pengguna
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Pengirim: ");
        nama = input.nextLine();

        System.out.print("Masukkan Berat Paket (kg): ");
        berat = input.nextDouble();

        System.out.print("Masukkan Jarak Pengiriman (km): ");
        jarak = input.nextInt();

        System.out.println("Pilih Jenis Layanan: ");
        System.out.println("1. Reguler");
        System.out.println("2. Express");
        System.out.println("3. Same Day");
        System.out.print("Masukkan pilihan (1-3): ");
        layanan = input.nextInt();

        System.out.println("Pilih Jenis Paket: ");
        System.out.println("1. Dokumen");
        System.out.println("2. Barang Biasa");
        System.out.println("3. Barang Elektronik");
        System.out.print("Masukkan pilihan (1-3): ");
        jenis = input.nextInt();

        // Perhitungan biaya
        biayaBerat = berat * 3500;
        biayaJarak = jarak * 1200;

        // Menentukan biaya layanan
        switch (layanan) {
            case 1:
                biayaLayanan1 = 10000; // Reguler
                break;
            case 2:
                biayaLayanan1 = 20000; // Express
                break;
            case 3:
                biayaLayanan1 = 50000; // Same Day
                break;
            default:
                System.out.println("Pilihan layanan tidak valid.");
        }

        // Menentukan biaya jenis paket
        switch (jenis) {
            case 1:
                biayaJenis = 5000; // Dokumen
                break;
            case 2:
                biayaJenis = 15000; // Barang Biasa
                break;
            case 3:
                biayaJenis = 30000; // Barang Elektronik
                break;
            default:
                System.out.println("Pilihan jenis paket tidak valid.");
        }

        // Hitung subtotal
        subtotal = biayaDasar + biayaBerat + biayaJarak;

        // Biaya layanan tambahan (25% dari subtotal)
        biayaLayanan1 = subtotal * 0.25;

        // Total sebelum diskon
        totalSebelumDiskon = subtotal + biayaLayanan1 + biayaJenis;

        // Diskon jika total di atas 70.000
        if (totalSebelumDiskon > 70000) {
            diskon = totalSebelumDiskon * 0.10;
        }

        // Hitung total akhir
        totalAkhir = totalSebelumDiskon - diskon;

        // Output hasil
        System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim   : " + nama);
        System.out.println("Berat Paket     : " + berat + " kg");
        System.out.println("Jarak Pengiriman: " + jarak + " km");

        System.out.print("Jenis Layanan   : ");
        switch (layanan) {
            case 1: System.out.println("Reguler"); break;
            case 2: System.out.println("Express"); break;
            case 3: System.out.println("Same Day"); break;
        }

        System.out.print("Jenis Paket     : ");
        switch (jenis) {
            case 1: System.out.println("Dokumen"); break;
            case 2: System.out.println("Barang Biasa"); break;
            case 3: System.out.println("Barang Elektronik"); break;
        }

        System.out.println("----------------------------------");
        System.out.println("Biaya Dasar            : Rp " + biayaDasar);
        System.out.println("Biaya Berat            : Rp " + biayaBerat);
        System.out.println("Biaya Jarak            : Rp " + biayaJarak);
        System.out.println("Subtotal               : Rp " + subtotal);
        System.out.println("Biaya Layanan (25%)    : Rp " + biayaLayanan1);
        System.out.println("Biaya Jenis Paket      : Rp " + biayaJenis);
        System.out.println("Total Sebelum Diskon   : Rp " + totalSebelumDiskon);
        System.out.println("Diskon                 : Rp " + diskon);
        System.out.println("==================================");
        System.out.println("TOTAL BIAYA AKHIR      : Rp " + totalAkhir);

        input.close();	
	  
	}

}
