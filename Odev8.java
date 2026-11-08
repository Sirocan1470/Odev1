
import java.util.Scanner;


public class Odev8 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Iki sayi ve bir islem giriniz:");
        
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        
        
        
        sc.nextLine();
        String islem = sc.nextLine();
        
        
        
        
        //bu kısmı ai ile yaptım ^^^^^^
        
        
        
        
                
                
                
                
                
        
        if ("+".equals(islem)) {
            System.out.println("Sonuc:"+(s1+s2));
        }
        if ("-".equals(islem)) {
            System.out.println("Sonuc:"+(s1-s2));
        }
        if ("*".equals(islem)) {
            System.out.println("Sonuc:"+(s1*s2));
        }
        if ("/".equals(islem)) {
            System.out.println("Sonuc:"+(s1/s2));
        }
        
        
        // normalde == kullanmıştım, uygulama ile düzelttim ^^^^^^
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
