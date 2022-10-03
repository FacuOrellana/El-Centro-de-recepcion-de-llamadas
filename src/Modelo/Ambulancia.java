package Modelo;


public class Ambulancia extends Recurso{
    private int nroAmbulancia;
    
    public Ambulancia(){
        
    }
    
    public Ambulancia(int nroAmbulancia){
        this.nroAmbulancia=nroAmbulancia;
    }

    public int getNroAmbulancia() {
        return nroAmbulancia;
    }

    public void setNroAmbulancia(int nroAmbulancia) {
        this.nroAmbulancia = nroAmbulancia;
    }
    
    
}
