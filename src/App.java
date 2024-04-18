import java.util.Scanner;

/*
 * Calculadora de IMC (Índice de Massa Corporal): Crie um programa que calcule o IMC 
 * de uma pessoa com base em sua altura e peso, ambos fornecidos pelo usuário.
 */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double result = peso / (altura * altura); // o imc é calculado dividindo o peso pela altura ao quadrado (altura * altura0

        System.out.println("Seu IMC é: " + result);

        scanner.close();
    }
}
