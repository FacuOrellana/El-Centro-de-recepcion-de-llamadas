
package Modelo;

import Vista.RegistrarLlamada;
import java.util.ArrayList;
import java.util.Date;


public class Llamada {
    private Date diaLlamada;
    private int nivel;
    Persona persona;
    Recurso recurso;
    ArrayList<Sintoma> listaSintoma = new ArrayList();
            
    public Llamada(Date diaLlamada, Persona persona, Recurso recurso){
        this.diaLlamada=diaLlamada;
        this.persona=persona;
        this.recurso=recurso;        
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona p) {
        this.persona = p;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso r) {
        this.recurso = r;
    }

    public ArrayList<Sintoma> getListaSintoma() {
        return listaSintoma;
    }

    public void setListaSintoma(ArrayList<Sintoma> listaSintoma) {
        this.listaSintoma = listaSintoma;
    }
    
    
    
    public void agregarSintoma(Sintoma s){
        this.listaSintoma.add(s);
    }
    
    public Date getDiaLlamada() {
        return diaLlamada;
    }

    public void setDiaLlamada(Date diaLlamada) {
        this.diaLlamada = diaLlamada;
    }
    
    
    public int cantidadDeSintomas(){
        return this.listaSintoma.size();
    }
}