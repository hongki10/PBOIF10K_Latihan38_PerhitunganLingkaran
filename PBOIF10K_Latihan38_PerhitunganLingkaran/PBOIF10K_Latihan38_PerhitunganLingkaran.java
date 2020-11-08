import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */

public class PBOIF10K10119915Latihan38 {
    public static void main(String[] args) {
        String diameter;
        double d;
        Scanner scanner  = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("======Perhitungan Lingkaran======");
     do{
         System.out.print("Masukan nilai diameter lingkaran : ");
         diameter = scanner.nextLine();
         System.out.println((!diameter.matches("[0-9]*")) ?
                 "Nilai Diameter tidak sesuai\n":"");
         
     } while(!diameter.matches("[0-9]*"));
        System.out.println("======Hasil Perhitungan Lingkaran======");
        d = Double.parseDouble(diameter);
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                            clc.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                            clc.luasLingkaran(clc.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                            clc.kelilingLingkaran(clc.jari2Lingkaran(d)));
    }
}

public class PBOIF10K10119915Latihan38 {
    public static void main(String[] args) {
        String diameter;
        double d;
        Scanner scanner  = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("======Perhitungan Lingkaran======");
     do{
         System.out.print("Masukan nilai diameter lingkaran : ");
         diameter = scanner.nextLine();
         System.out.println((!diameter.matches("[0-9]*")) ?
                 "Nilai Diameter tidak sesuai\n":"");
         
     } while(!diameter.matches("[0-9]*"));
        System.out.println("======Hasil Perhitungan Lingkaran======");
        d = Double.parseDouble(diameter);
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                            clc.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                            clc.luasLingkaran(clc.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                            clc.kelilingLingkaran(clc.jari2Lingkaran(d)));
    }
}