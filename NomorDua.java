import java.util.Scanner;

public class NomorDua {
    public static void main(String[] args) {
    int Masuk,Keluar,Lama,Biaya;
    Scanner Scan = new Scanner(System.in);

    System.out.print("Jam Masuk:");
    Masuk = Scan.nextInt();
    System.out.print("Jam keluar:");
    Keluar =Scan.nextInt();
    System.out.print("Lama:");
    Lama =Scan.nextInt();

    if (Keluar >= Masuk) {
        Lama = Keluar - Masuk;
    }
    else {
        Lama = 12-Masuk+Keluar;
    }

    if (Lama >2) {
        Biaya = 2000 + ((Lama-2)*500);
    }
    else {
        Biaya = 2000;
        }
    System.out.println("Biaya="+Biaya);
    }
}