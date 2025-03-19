package aulas.faculdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercicio 1
        ExibirNome.printName();

        // Exercicio 2
        Calculadora.operations(5, 2);

        // Exercicio 3
        Calculadora.calculateVariables(3, 5);

        // Exercicio 4
        Calculadora.calculateMean(scanner);

        // Exercicio 5
        Calculadora.calculateWeightedAverage(scanner);

        // Exercicio 6
        Calculadora.calculateSalaryDiscounted(1000);

        // Exercicio 7
        Calculadora.calculateAverageSpeed(scanner);

        // Exercicio 8
        Calculadora.calculateCarRentalPrice(scanner);

        // Exercicio 9
        Calculadora.timeUntilDeath(scanner);

        scanner.close();

    }

}