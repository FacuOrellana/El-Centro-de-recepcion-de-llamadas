package Modelo;

//import java.time.LocalTime;
import java.util.Date;
import java.util.GregorianCalendar;


public class Turno extends Recurso{
    private String diaTurno;
    private String horaTurno;
    private String nroTelefono;

    public Turno() {
    }
    
    
    
    public Turno(String diaTurno, String horaTurno, String nroTelefono){
        this.diaTurno=diaTurno;
        this.horaTurno=horaTurno;
        this.nroTelefono=nroTelefono;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    
    public String getDiaTurno() {
        return diaTurno;
    }

    public void setDiaTurno(String diaTurno) {
        this.diaTurno = diaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }
}
