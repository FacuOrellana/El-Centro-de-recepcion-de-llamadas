package Modelo;

import java.util.ArrayList;


public class Nivel {
    private String descripcion;
    private int numeroNivel;
    private ArrayList<Sintoma> Sintomas = new ArrayList<>();
    private Recurso recurso;
    
    public Nivel(String descripcion, int numeroNivel){
        this.descripcion=descripcion;
        this.numeroNivel=numeroNivel;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public ArrayList<Sintoma> getSintomas() {
        return Sintomas;
    }

    public void addSintomas(Sintoma sintoma) {
        this.Sintomas.add(sintoma);
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
}
