package sincro;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public Examen(String titulo, String enunciado, double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public boolean estaAprobado(){
        //el examen se aprueba con nota >=4
        return nota>=4;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getNota() {
        return nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }
}
