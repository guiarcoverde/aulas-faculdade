package aulas.faculdade;
import java.util.Scanner;

public class Calculadora {
    public static void operations(float x, float y) {
        String sumResult = String.format("Soma: %.1f", x + y);
        String subResult = String.format("Subtração: %.1f", x - y);
        String multResult = String.format("Multiplicação: %.1f", x * y);
        String divResult = String.format("Divisão: %.1f", x / y);
        
        System.out.println(sumResult);
        System.out.println(subResult);
        System.out.println(multResult);
        System.out.println(divResult);
    }

    public static void calculateVariables(int a, int b) {
        System.out.println(String.format("Resultado de 2a + 3b: %d", (2*a + 3*b)));
    }

    public static void calculateMean(Scanner scanner){
        

        System.out.println("Digite a primeira nota");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota");
        double num3 = scanner.nextDouble();

        double mean = (num1 + num2 + num3) / 3;

        System.out.printf("A média das notas é: %.2f%n", mean);
    }

    public static void calculateWeightedAverage(Scanner scanner){

        System.out.println("Digite a primeira nota");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota");
        double num3 = scanner.nextDouble();

        double weightedAverage = ((num1 * 0.3) + (num2 * 0.3) + (num3 * 0.4));

        System.out.printf("A média das notas é: %.2f%n", weightedAverage);
    }

    public static void calculateSalaryDiscounted(double salary) {
        System.out.printf("O salário com líquido é de: %.2f%n", salary - (salary * 0.21));
    }

    public static void calculateAverageSpeed(Scanner scanner) {
        System.out.println("Digite a distancia percorrida (em km): ");
        int distance = scanner.nextInt();

        System.out.println("Digite o tempo gasto (em horas): ");
        int timeSpent = scanner.nextInt();

        System.out.printf("A velocidade média do percurso foi de: %dkm/h", (distance / timeSpent));
    }

    public static void calculateCarRentalPrice(Scanner scanner) {
        System.out.println("Digite a quantidade de dias de aluguel: ");
        double timeRented = scanner.nextDouble();

        System.out.println("Digite a quantidade kms rodados: ");
        double distance = scanner.nextDouble();

        System.out.printf("O valor total é de: %.2f%n", (60 * timeRented) + (0.15 * distance));
    }

    public static void timeUntilDeath(Scanner scanner) {
        System.out.println("Quantos cigarros você fuma por dia?");
        double smokedCigarettes = scanner.nextDouble();

        System.out.println("Há quantos anos você fuma?");
        double smokingTime = scanner.nextDouble();

        double yearsToDays = smokingTime * 365.25;
        
        double totalSmoked = smokedCigarettes * yearsToDays;

        double minutesLost = totalSmoked * 10;

        double totalDaysLost = minutesLost / 1440;

        System.out.printf("Você perdeu %.2f dias de vida", totalDaysLost);
    }
}
