package ex_k;
import java.util.Scanner; 

public class Ex_K {   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double salario, venda, comissao;
        
        System.out.println("Digite seu salario: ");
        salario = sc.nextDouble();
        
        System.out.println("Digite suas vendas: ");
        venda = sc.nextDouble();
        
        comissao = 0.04 * venda;
        
        System.out.println("Sua comissao foi de: " + comissao + " Seu salario final e: " + (salario + comissao));
        
 
       
        
        
        
    }
    
}
