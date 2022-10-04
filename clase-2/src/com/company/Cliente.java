package com.company;

public class Cliente {
    // Atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    // Constructor
    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        deuda = 0.0;
    }

    // Métodos
    public void incrementarDeuda(Double valor) {
        deuda += valor;
    }

    public void pagarDeuda() {
        deuda = 0.0;
    }

    // Getter
    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    // Setter
    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
}
