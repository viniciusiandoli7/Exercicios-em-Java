package ex_a;
import java.util.Scanner;
    
    public class Ex_A {

        public static void main(String[] args) {

           Scanner sc = new Scanner (System.in);

           int num1, num2, num3, result;

           System.out.println("Digite um numero: ");
           num1 = sc.nextInt();

           System.out.println("Digite um numero: ");
           num2 = sc.nextInt();

           System.out.println("Digite um numero: ");
           num3 = sc.nextInt();

           result = num1 * num2 * num3;
           System.out.println("Seu resutado é: " + result);


        }

}
