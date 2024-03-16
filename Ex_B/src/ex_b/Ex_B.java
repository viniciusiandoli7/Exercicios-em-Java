package ex_b;
import java.util.Scanner;

public class Ex_B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        float a1, a2, a3, result;
        
        System.out.print("Digite sua primeira nota: ");
        a1 = sc.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        a2 = sc.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        a3 = sc.nextFloat();
        
        result = ((a1*3) + (a2*3) + (a3*4))/10;
        
        System.out.println("Sua media e: " + result);
      
                
                
    
        
  
        
    }
    
}
