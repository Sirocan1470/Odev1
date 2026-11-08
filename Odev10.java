
import java.util.Scanner;


public class Odev10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Uc kenar uzunlugunu girin:");
        
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        
        if (k1-k2 < k3 && k3 < k1+k2) {
            
            if (k1 == k2 && k2 == k3) {
                System.out.println("Olusan ucgen: eskenar");
            } else {
                
                if (k1 == k2 || k1 == k3 || k2 == k3) {
                    System.out.println("Olusan ucgen: ikizkenar");
                } else {
                    System.out.println("Olusan ucgen: cesitkenar");
                }
                
            }
            
        } else {
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
