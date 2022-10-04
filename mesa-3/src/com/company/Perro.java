package com.company;

public class Perro {
    // Atributos
    private String nombre;
    private String raza;
    private double peso;
    private int anioDeNacimientoAprox;
    private boolean tieneChip;
    private boolean estaLastimado;

    // Constructores
    public Perro(String nombre, String raza, double peso, boolean tieneChip, boolean estaLastimado) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
    }

    public Perro(String nombre, String raza, double peso, int anioDeNacimientoAprox, boolean tieneChip, boolean estaLastimado) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.anioDeNacimientoAprox = anioDeNacimientoAprox;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
    }

     public int calcularEdad() {
        // Usamos una variable local para definir el año en curso y restarlo al año aproximado de nacimiento
        final int FECHA_ACTUAL = 2022;
        return FECHA_ACTUAL - this.anioDeNacimientoAprox;
     }

     public void sePuedePerder() {
        // Usamos el método getTieneChip() para que nos devuelva el booleano correspondiente
        if (getTieneChip()) {
            System.out.println("Tranquilo tiene chip, no puede perderse");
        }else{
            System.out.println("Se puede perder necesita chip");
        }
     }

     public void sePuedeAdpotar() {
        // Usamos una doble condición: Si cumple con ambas se puede adoptar
         if (!estaLastimado && peso >= 5.45) {
             System.out.println("Felicitaciones, lo puedes adoptar!");
         } else {
             System.out.println("No lo puedes adoptar, escoge otro!");
         }

     }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getAnioDeNacimientoAprox() {
        return anioDeNacimientoAprox;
    }

    public boolean getTieneChip() {
        return tieneChip;
    }

    public boolean getEstaLastimado() {
        return estaLastimado;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAnioDeNacimientoAprox(int anioDeNacimientoAprox) {
        this.anioDeNacimientoAprox = anioDeNacimientoAprox;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }
}
