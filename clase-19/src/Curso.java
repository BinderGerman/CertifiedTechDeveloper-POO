public class Curso extends OfertaAcademica {
    public int cargaHoraria;
    public int duracion;
    public double valorHora;

    //Constructor
    /*No hacemos constructor porque vamoa a crear las clases desde el Factory*/

    //Métodos
    @Override
    public double calcularPrecio() {
        return cargaHoraria * duracion * valorHora;
    }

    //Getters y Setter
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
