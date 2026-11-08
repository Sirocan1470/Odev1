
import java.util.Scanner;


public class Odev7 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Bir sayi girin:");
        
        int sayi = sc.nextInt();
        
        
        
        if (sayi%3 == 0 && sayi%5 == 0) {
            System.out.println("Girdiginiz sayi hem 3e hem 5e tam bolunur");
        } else {if (sayi%3 == 0) {
                System.out.println("Girdiginiz sayi 3e tam bolunur");
            } else {if (sayi%5 == 0) {
                System.out.println("Girilen sayi 5e tam bolunur");
            } else {System.out.println("Girilen sayi 3e veya 5e tam bolunmez");
            }
            }
        }
        
        
        
        
        
        
    }
    
    
    
    
}
