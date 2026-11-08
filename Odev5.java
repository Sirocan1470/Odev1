
import java.util.Scanner;


public class Odev5 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Not giriniz:");

    
    int not = sc.nextInt();

if (not < 0 || not > 100) { 
    
    System.out.println("Lutfen tekrar deneyin");
    
} else if (not >= 90) {
    
    System.out.println("Notunuz: AA");
    
} else if (not >= 80) {
    
    System.out.println("Notunuz: BA");
    
} else if (not >= 70) {
    
    System.out.println("Notunuz: BB");
    
} else if (not >= 60) {
    
    System.out.println("Notunuz: CB");
    
} else if (not >= 50) {
    
    System.out.println("Notunuz: CC");
    
} else {
    
    System.out.println("Notunuz: FF");
    
}}}
