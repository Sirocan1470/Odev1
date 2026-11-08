
import java.util.Scanner;


public class Odev1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Bir sayi giriniz:");
        int sayi = sc.nextInt();
        
        if (sayi%2 == 0) {
            System.out.println("Girdiginiz sayi cift");
        }else{
            System.out.println("Girdiginiz sayi tek");
}}}


// kodların hepsini aynı anda çalıştırmaya çalışınca olmuyor ama teker teker açınca çalışıyor