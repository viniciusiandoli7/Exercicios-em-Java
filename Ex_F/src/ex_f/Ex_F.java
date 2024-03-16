package ex_f;
import java.util.Scanner;

       
public class Ex_F {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        double area, base, altura;
        
        System.out.println ("Digite sua base: ");
        base = sc.nextDouble();
        
        System.out.println ("Digite sua altura: ");
        altura = sc.nextDouble();
        
        area = (base * altura) / 2;
                
        System.out.println ("Resultado da area do triangulo: " + area);
     
    
        
        
        
        
        
        
    }
    
}
