
import java.util.Scanner;


public class Odev2 {
    public static void main(String[] args) {
        
        
        
        
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Bir sayi girin:");
        
        int sayi = sc.nextInt();
        
        if (sayi>0) {System.out.println("Girilen sayi pozitif");
            
        } else {if (sayi<0) {System.out.println("Girilen sayi negatif");
                
            } else {System.out.println("Girilen sayi sifir");
            }
        }
}}
