package com.company;

import java.util.Scanner;

public class CuentaComitente extends Cuenta{
    //Atributo
    private String cnv = "123";

    @Override
    public void depositar(double monto) {
        final double PORCENTAJE_A_DEPOSITAR = 0.99;
        setSaldo(informarSaldo() + (monto * PORCENTAJE_A_DEPOSITAR));
    }

    @Override
    /*Se hacen diferentes tipos de comprobaciones
        - 1° Que el monto ingresado NO supere el saldo. Si lo supera, se avisa sobre este hecho y se pide
        que reintente con otro monto.
        - 2° Si el monto ingresado es menor o igual al 50% del saldo, se hace la extracción sin problemas
        - 3° En caso contrario (el monto supera el 50%) se pide clave CNV por medio del scanner
        - 4° Se comprueba si son iguales las claves y si lo son se procede a la extracción, si no lo son:
        - 5° el monto se equipara al 50% del total depositado y se procede a la extracción*/
    public void extraer(double monto) {
        if(informarSaldo() >= monto) {
            if ((informarSaldo()*0.50) >= monto) {
                setSaldo(informarSaldo() - monto);
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("ingrese su clave CNV");
                String cnvDeComprobacion = scanner.nextLine();
                if(cnv.equals(cnvDeComprobacion)) {
                    setSaldo(informarSaldo() - monto);
                } else {
                    monto = informarSaldo() * 0.50;
                    setSaldo(informarSaldo() - monto);
                    System.out.println("La clave CNV no es correcta solo puede retirar " +
                                        "hasta el 50% del total de su cuenta");
                }
            }
        } else {
            System.out.println("El monto supera la cantidad depositada, intente nuevamente");
        }
    }

}
