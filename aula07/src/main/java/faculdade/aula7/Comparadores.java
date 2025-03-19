package faculdade.aula7;

import javax.swing.JOptionPane;

public class Comparadores {
    public static void compararRealMaiorQueInteiro() {
        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        double numeroReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));
        
        if (numeroInteiro < numeroReal) {
            JOptionPane.showMessageDialog(null, "O número inteiro é menor que o número real.");
        } else {
            return;
        }
    }

    public static void compararDoisNumerosReais() {
        double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real:"));
        double segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real:"));

        if (primeiroNumero > segundoNumero) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "O segundo número é maior que o primeiro.");
        }
    }

    public static void compararDoisNumerosInteiros() {
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número real:"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número real:"));

        if (primeiroNumero > segundoNumero) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "O segundo número é maior que o primeiro.");
        }
    }

    public static void compararMaiorOuIgual() { 
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (primeiroNumero == segundoNumero) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        } else {
            int maiorNumero = Math.max(primeiroNumero, segundoNumero);
            JOptionPane.showMessageDialog(null, String.format("%d é o maior número", maiorNumero));
        }
    }

    public static void exibirDados() {
        double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double terceiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        double soma = primeiroNumero + segundoNumero + terceiroNumero;
        double media = ((primeiroNumero + segundoNumero + terceiroNumero) / 3);
        double produto = (primeiroNumero * segundoNumero * terceiroNumero);
        
        double menorNumero;
        double maiorNumero;

        if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero) {
            menorNumero = primeiroNumero;
        } else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero) {
            menorNumero = segundoNumero;
        } else {
            menorNumero = terceiroNumero;
        }

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            maiorNumero = primeiroNumero;
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            maiorNumero = segundoNumero;
        } else {
            maiorNumero = terceiroNumero;
        }

        JOptionPane.showMessageDialog(null, String.format("Soma dos números: %.1f\nMédia dos números: %.1f\nProduto dos números: %.1f\nMenor número: %.1f\nMaior Número: %.1f", soma, media, produto, menorNumero, maiorNumero));

    }

    public static void saqueSaldoBancario() {
        double saldoDaConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta:"));
        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar da conta:"));

        if (valorSaque > saldoDaConta) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            return;
        }

        double novoSaldo = saldoDaConta - valorSaque;
        JOptionPane.showMessageDialog(null, String.format("Saque no valor de: %.2f realizado com sucesso\nSaldo restante: %.2f", valorSaque, novoSaldo));
    }

    public static void compraDeRoupa() {
        double valorRoupa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa"));
        int metodoDePagamento = Integer.parseInt(JOptionPane.showInputDialog("Escolha o método de pagamento:\n 0 - Compra a vista\n 1 - Compra parcelada no cartão\n 2 - Crediário"));

        int parcelas = 1;

        if (metodoDePagamento == 1 || metodoDePagamento == 2) {
            parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas desejadas (máximo 12)"));
            if (parcelas > 12) {
                JOptionPane.showMessageDialog(null, "Número de parcelas inválido");
                return;
            }
        }
        
        switch (metodoDePagamento) {
            case 0:
                double valorComDesconto = valorRoupa - (valorRoupa * 0.1);
                JOptionPane.showMessageDialog(null, String.format("Valor a pagar: R$%.2f", valorComDesconto));
                break;
            case 1:
                double valorParcelado = valorRoupa / parcelas;

                JOptionPane.showMessageDialog(null, String.format("A pagar: %d parcelas de R$%.2f\n Valor total: %.2f", parcelas, valorParcelado, valorRoupa));
                break;
            case 2:
                double valorComJuros = valorRoupa + (valorRoupa * 0.1);
                double valorParceladoComJuros = valorComJuros / parcelas;

                JOptionPane.showMessageDialog(null, String.format("A pagar: %d parcelas de R$%.2f\n Valor total: %.2f", parcelas, valorParceladoComJuros, valorComJuros));
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção de pagamento inválida");
                break;
        }

    }

    public static void calcularImc() {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));

        double imc = (peso / (altura * altura));

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é: %.1f.\nVocê está abaixo do peso ideal.", imc));
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é: %.1f.\nVocê está no peso ideal, muito bem.", imc));
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é: %.1f.\nVocê está sobrepeso, um leve regime pode ajudar.", imc));
        } else if (imc >= 30.0 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é: %.1f.\nVocê está obeso leve.", imc));
        } else if (imc >= 35.0 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é: %.1f.\nVocê está obeso moderado", imc));
        } else {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é: %.1f.\nVocê está obeso mórbido.", imc));
        }
    }
}
