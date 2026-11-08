
import java.util.Scanner;


public class Odev9 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("1 ile 7 arasinda bir sayi girin:");
        
        int gun = sc.nextInt();
        
        if (gun > 7 || gun < 1) {
            System.out.println("1 ile 7 arasinda bir sayi girin!");
        } else {
            switch (gun) {
                case 1 :
                    System.out.println("Pazartesi");
                        
                    break;
                case 2 :
                    System.out.println("Sali");
                
                    break;
                case 3 :
                    System.out.println("Carsamba");
                    break;
                case 4 :
                    System.out.println("Persembe");
                    break;
                case 5 :
                    System.out.println("Cuma");
                    break;
                case 6 :
                    System.out.println("Cumartesi");
                    break;
                case 7 :
                    System.out.println("Pazar");
                    break;
                

            }
        }
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
