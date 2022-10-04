import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente("Juan","Perez","COVID19 Variante Flurona",new Date(122,1,2));
            //Al método dar alta le paso una fecha anterior (10/01/2022) a su fecha de ingreso (02/02/2022) para que salte la excepciónD
            paciente.darAlta(new Date(122,0,10));
        }
        catch (FechaException f) {
            System.err.println(f.getMessage());
        }


    }
}
