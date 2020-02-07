import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nama : Rifka Canalisa R (123180062/Prak. PBO A)
        String nama;
        int banyaknilai, nilaibesar=0, nilairendah, total=0;
        float ratarata;

        Scanner scn = new Scanner (System.in);
        System.out.println("INPUT");
        System.out.print("Nama Anda = ");
        nama = scn.nextLine();

        System.out.print("Jumlah nilai yang ingin dimasukkan : ");
        banyaknilai = scn.nextInt();
        int nilai[] = new int[banyaknilai];
        int k;
        for(int i=0; i<banyaknilai; i++){
            k = i+1;
            System.out.print("Nilai ke-" + k + " : ");
            nilai[i] = scn.nextInt();
        }

        // Mencari Nilai Tertinggi
        for(int i=0; i<banyaknilai; i++){
            if(nilaibesar < nilai[i]){
                nilaibesar = nilai[i];
            }
        }

        // Mencari Nilai Terendah
        nilairendah=nilai[0];
        for(int i=0; i<banyaknilai; i++){
            if(nilairendah > nilai[i]){
                nilairendah = nilai[i];
            }
        }

        // Menghitung Rata-rata nilai
        for(int i=0; i<banyaknilai; i++){
            total = total + nilai[i];
        }
        ratarata = (float) total / banyaknilai;

        System.out.println();
        System.out.println("OUTPUT");
        System.out.println("Nama = " + nama);
        System.out.println("Nilai Terbesar : " + nilaibesar);
        System.out.println("Nilai Terendah : " + nilairendah);
        System.out.println("Rata-rata Nilai  : " + ratarata);
    }
}
