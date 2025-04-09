package org.example;

import javax.swing.*;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 2025;
        this.velocidadeAtual = 0;
    }

    public Carro(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public static void acelerar() {
        JOptionPane.showMessageDialog(null, "O carro está sendo acelerado");
    }

    public static void frear() {
        JOptionPane.showMessageDialog(null, "O carro está sendo freado");
    }

    public void exibirInfo() {
        JOptionPane.showMessageDialog(null, String.format("Marca: %s\nModelo: %s\nAno: %d\nVelocidade atual: %dkm/h", marca, modelo, ano, velocidadeAtual));
    }
}
