
import java.util.Scanner;


public class Odev4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Uc sayi giriniz:");
        
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        
        if (s1>s2 && s1>s3) {
            System.out.println("Girilen en buyuk sayi: birinci sayi");
        } else {if (s2>s1 && s2>s3) {System.out.println("Girilen en buyuk sayi: ikinci sayi");
    
        } else {if (s3>s1 && s3>s2) {System.out.println("Girilen en buyuk sayi: ucuncu sayi");
    
        } else {System.out.println("Girilen sayilar birbirine esit");
        }
}}}}
