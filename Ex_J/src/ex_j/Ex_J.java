package ex_j;
import java.util.Scanner;

public class Ex_J { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double nota1, nota2, result;
        
        System.out.println("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();
        
        result = ((nota1*2) + (nota2*3))/5;
        
        System.out.println("Sua media e: " + result);
       
        
        
       
        
        
        
        
        
    }
    
}
