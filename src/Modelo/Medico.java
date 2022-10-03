package Modelo;


public class Medico extends Recurso{
    private String nombreMedico;
    private int nroInterno;
    
    public Medico(){
        
    }
    
    public Medico(String nombreMedico, int interno){
        this.nombreMedico=nombreMedico;
        this.nroInterno=interno;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public int getNroInterno() {
        return nroInterno;
    }

    public void setNroInterno(int nroInterno) {
        this.nroInterno = nroInterno;
    }
    
    
}
