import java.util.Date;
public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;

    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FechaException {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        this.historiaClinica = historiaClinica;
        fechaAlta = null;
        if (fechaInternacion.after(hoy)) {
            throw new FechaException("No se puede realizar un ingreso en una fecha posterior a la fecha actual");
        } else {
            this.fechaInternacion = fechaInternacion;
        }
    }

    public void darAlta(Date fechaAlta) throws FechaException {
        if (fechaAlta.after(fechaInternacion))
            this.fechaAlta = fechaAlta;
        else
            throw new FechaException("No se puede crear una fecha de alta que sea anterior a la fecha de internación");
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }


}
