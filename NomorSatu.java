import java.util.Scanner;
public class NomorSatu {
    public static void main(String[] args) {
        int Masuk, Keluar, Lama;
        Scanner Scan = new Scanner(System.in);

        System.out.print("Jam masuk:");
        Masuk = Scan.nextInt();
        System.out.print("Jam Keluar:");
        Keluar = Scan.nextInt();

        if (Keluar >= Masuk)  
        { Lama = Keluar-Masuk;} 
        else {
            Lama = 12-Masuk + Keluar;
            } 
        System.out.println(Lama);
    }  
}