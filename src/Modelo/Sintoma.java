package Modelo;


public class Sintoma {
    private String nombreSintoma;
    private int numeroNivel;
    
    public Sintoma(){
        
    }
    
    public Sintoma(String nombreSintoma, int numeroNivel){
        this.nombreSintoma=nombreSintoma;
        this.numeroNivel=numeroNivel;
    }

    public String getNombreSintoma() {
        return nombreSintoma;
    }
    

    public void setNombreSintoma(String nombreSintoma) {
        this.nombreSintoma = nombreSintoma;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }
    
    

}