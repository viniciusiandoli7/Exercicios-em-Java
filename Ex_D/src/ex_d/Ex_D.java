package ex_d;
import java.util.Scanner;

public class Ex_D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double salario, aumento, imposto;
        System.out.println("Digite seu salario: ");
        salario = sc.nextDouble();
        
        aumento = salario * 0.05;
        System.out.println ("Sua bonificacao foi de: " + aumento);
        
       
        imposto = salario * 0.07;
        System.out.println ("Seu imposto e: " + imposto);
        
    }
    
}
