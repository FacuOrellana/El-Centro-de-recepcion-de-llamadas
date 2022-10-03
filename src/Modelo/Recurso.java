
package Modelo;


public class Recurso {
    private EstadoRecurso estado;    
    String tipo;

    public EstadoRecurso getEstado() {
        return estado;
    }

    public void setEstado(EstadoRecurso estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Recurso{" + "tipo=" + tipo + '}';
    }

    
        
}
