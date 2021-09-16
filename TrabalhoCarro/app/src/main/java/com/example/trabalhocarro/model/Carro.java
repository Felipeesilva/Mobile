package com.example.trabalhocarro.model;

public class Carro {

    private String marca;
    private String modelo;
    private int fabricacao;
    private String cor;
    private float motor;
    private String combustivel;
    private float fipe;

    public Carro() {
    }

    public Carro(String marca, String modelo, int fabricacao, String cor, float motor, String combustivel, float fipe) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacao = fabricacao;
        this.cor = cor;
        this.motor = motor;
        this.combustivel = combustivel;
        this.fipe = fipe;
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

    public int getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getFipe() {
        return fipe;
    }

    public void setFipe(float fipe) {
        this.fipe = fipe;
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo;
    }
}
