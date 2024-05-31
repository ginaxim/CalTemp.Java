import java.util.Scanner;
 
public class Temperatura {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
Scanner input = new Scanner(System.in);
 
        System.out.printf("Informe a temperatura em Celsius:\n");
        C = input.nextDouble();
 
        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;
 
        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Rankine é: " + Ra);
        System.out.println("A temperatura em Réaumur é: " + Re);
    }
}