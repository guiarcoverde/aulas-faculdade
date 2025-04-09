package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.acelerar();
        carro1.frear();
        carro1.exibirInfo();


        String marca = JOptionPane.showInputDialog("Marca: ");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        int velocidadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Velocidade: "));

        Carro carro2 = new Carro(marca, modelo, ano, velocidadeAtual);
        carro2.acelerar();
        carro2.frear();
        carro2.exibirInfo();

        CarroComGettersESetters carro3 = new CarroComGettersESetters();
        carro3.setMarca(marca);
        carro3.setModelo(modelo);
        carro3.setAno(ano);
        carro3.setVelocidadeAtual(velocidadeAtual);
        carro3.exibirInfo();
    }
}