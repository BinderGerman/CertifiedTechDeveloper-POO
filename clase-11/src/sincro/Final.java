package sincro;

public class Final extends Examen implements Comparable{
    private double notaOral;
    private String temaOral;

    public Final(String titulo, String enunciado, double nota, Alumno alumno, double notaOral, String temaOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado(){
        return (getNota()>=4 && notaOral>=4);
    }

    @Override
    public int compareTo(Object o) {
        // casting a Final
        Final compFinal=(Final)o;
        int resp=0;
        // promedio mio
        double promedio=(getNota()+notaOral)/2;
        // promedio del parametro
        double promedio2=(compFinal.getNota()+compFinal.notaOral)/2;
        if (promedio>promedio2)
            resp=1;
        if (promedio<promedio2)
            resp=-1;
        return resp;
    }
}
