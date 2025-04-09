package org.example;

import javax.swing.*;

public class CarroComGettersESetters {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public CarroComGettersESetters() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 2025;
        this.velocidadeAtual = 0;
    }

    public CarroComGettersESetters(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void exibirInfo() {
        JOptionPane.showMessageDialog(null, String.format("Marca: %s\nModelo: %s\nAno: %d\nVelocidade atual: %dkm/h", getMarca(), getModelo(), getAno(), getVelocidadeAtual()));
    }
}
