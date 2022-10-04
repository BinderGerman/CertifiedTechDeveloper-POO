package sincro;

public class Parcial extends Examen{
    private int unidad;
    private int nroDeReintento;


    public Parcial(String titulo, String enunciado, double nota, Alumno alumno, int unidad) {
        super(titulo, enunciado, nota, alumno);
        this.unidad=unidad;
        this.nroDeReintento=0;
    }

    public boolean sePuedeRecuperar(){
        if (unidad<=3)
            return nroDeReintento<=2;
        else
            return nroDeReintento<=1;
    }
}
