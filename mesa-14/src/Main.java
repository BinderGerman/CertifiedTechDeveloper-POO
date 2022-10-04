public class Main {
    public static void main(String[] args) {
        //Se crean las reservas
        Reserva reserva1 = new Reserva(101,"Suipacha", "Buenos Aires", 5);
        Reserva reserva2 = new Reserva(102, "Buenos Aires", "Bragado", 6);

        //Se crea el sistema
        Sistema expresoBsAsBragado = new Sistema("Expreso Buenos Aires - Bragado");
        expresoBsAsBragado.addReserva(reserva1);
        expresoBsAsBragado.addReserva(reserva2);

        //Se prueban los métodos de Sistema
        System.out.println("Monto total recaudado: " + expresoBsAsBragado.recaudacionTotal());

        try {
            //Este código no funciona, si la estación NO aparece en las dos reservas el método no lo toma y tira la excepción
            System.out.println("Cantidad de personas que pasarán por estación Suipacha según reservas: "
                    + expresoBsAsBragado.cantVecesRecorrida("Suipacha"));
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }




        /*----------------------------------------------------------------------------------------------*/
        /*TODO ESTE BLOQUE DE CÓDIGO NO ESTA RELACIONADO CON EL EJERCICIO Y NO SE COMO RESOLVERLO*/
        //Creo el objeto estaciones
        Trayecto estaciones = new Trayecto();
        //Compruebo si quedaron bien ordenadas las estaciones
        System.out.println("las estaciones del trayecto son: " + estaciones.getEstaciones());
        //Agrego una estación màs al recorrido
        estaciones.addEstaciones(2, "Constitucion");
        System.out.println("las estaciones del trayecto son: " + estaciones.getEstaciones());
        //Comprueba que estación está en determinado índice
        System.out.println("la 3° estación del recorrido es: " + estaciones.getEstacion(2));

        /*---------------------------------------------------------------------------------------------*/

    }






}
