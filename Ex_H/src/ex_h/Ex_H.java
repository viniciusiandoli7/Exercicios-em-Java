package ex_h;
import java.util.Scanner;

public class Ex_H {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        double litros, distancia, km;
        
        System.out.println ("Digite quantos litros seu carro faz por KM ");
        litros = sc.nextDouble();
        
        
        System.out.println ("Sua distancia percorrida foi de: ");
        distancia = sc.nextDouble();
        
        km = distancia * litros;
        
        System.out.println ("O carro gastou " + km);
        
        System.out.println ("Litros por distancia "); 
        
        
        
        
        
        
        
        
    }
    
}
