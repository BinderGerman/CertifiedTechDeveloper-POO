public class Main {
    public static void main(String[] args) {

       //Se crea la clase reparación en el Estado "EnPresupuesto" y se carga el presupuesto inicial
       Reparacion reparacion1 = new Reparacion("La Batidora... la batidora", "Av. Siempre Viva 123");
       reparacion1.presupuestar(1000);

       //Se pasa al Estado "EnReparacion" y se suma al presupuesto el valor de los repuestos
       reparacion1.siguientePaso();
       reparacion1.presupuestarRepuestos(500);

       //Se pasa al Estado "ParaEnvio" y se cambia el atributo de dirección
       reparacion1.siguientePaso();
       reparacion1.modificarDireccion("Av. Baltimore 321");

       //Se pasa al Estado Finalizado y no se hace más nada
       reparacion1.siguientePaso();




    }
}
