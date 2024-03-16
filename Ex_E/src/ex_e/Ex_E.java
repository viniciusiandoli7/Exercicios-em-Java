package ex_e;
import java.util.Scanner;


public class Ex_E {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double area, altura, base;
        
        System.out.println ("Digite a base do retangulo: ");
        base = sc.nextDouble();
        
        
        System.out.println ("Digite a altura do retangulo: ");
        altura = sc.nextDouble();
        
        area = base * altura;
        
        System.out.println ("Resultado da area do retangulo: " + area);
       
        
       
        
        
        
    }
    
}
