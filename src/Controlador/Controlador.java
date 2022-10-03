package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Controlador implements ActionListener {
     private MenuPrincipal view;
     private ListarLlamada viewListaPersonas;
     private RegistrarLlamada viewRegistrarLlamada;
     private Ambulancia ambulancia;
     private EstadoRecurso estadoRecurso;
     private Llamada llamada;
     private Medico medico;
     private Nivel nivel;
     private Persona persona;
     private Recurso recurso;
     private Sintoma sintoma;
     private Turno turno;
     Persistencia persistencia;
     
     public Controlador(Persistencia persistencia){
         view = new MenuPrincipal();
         this.persistencia=persistencia;
     }
     
     
     
     
     //El controlador es el que crea y mete dentro del arreglo.
     public void crearPersona(int dni, String apellido, String nombre, String domicilio, String telefono){
        persistencia.personas.add(new Persona(dni, apellido, nombre, domicilio, telefono));
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(viewRegistrarLlamada.BTNAGREGAR)) {
            viewRegistrarLlamada.ejecutar();
        }
    }
     
    
    public void cargarListaSintomas(JComboBox jc){
        for(Sintoma s: persistencia.sintomas){
            jc.addItem(s.getNombreSintoma());
        }
    }
    
    public Sintoma obtenerSintoma(String nombreSintoma){
        for(Sintoma sintoma: persistencia.sintomas){
            if(sintoma.getNombreSintoma().equals(nombreSintoma)){
                return sintoma;
            }
        }
        return null;
    }
    
    
    public int obtenerMayorNivelSintoma(JTable jt){
        int mayor=0;
        for(int i=0;i<jt.getRowCount();i++){
            if(mayor<Integer.parseInt(jt.getValueAt(i, 1).toString())){
                mayor=Integer.parseInt(jt.getValueAt(i, 1).toString());
            }
        }
        return mayor;
    }
    
    
    public void crearLlamada(int dni, int nivel, JTable jt){
        Persona persona=null;
        for(Persona personas : persistencia.personas){
            if(personas.getDni()==dni){
                persona=personas;
            }
        }
        
        Llamada llamada = new Llamada(new Date(), persona, recurso);
        
        for(Nivel niveles : persistencia.niveles){
            if(niveles.getNumeroNivel()==nivel){
                llamada.setRecurso(niveles.getRecurso());
            }
        }
        
        llamada.setNivel(nivel);
        
        for(int i=0;i<jt.getRowCount();i++){
            llamada.agregarSintoma(obtenerSintoma(jt.getValueAt(i, 0).toString()));
        }
        persistencia.llamadas.add(llamada);
    }
    
    
    
    public void listarPersonas(JTable jt){
        Calendar fecha = Calendar.getInstance();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH)+1;
        int anio = fecha.get(Calendar.YEAR);
        DefaultTableModel m = (DefaultTableModel) jt.getModel();
        for(Llamada llamadas: persistencia.llamadas){
            m.addRow(new Object[]{llamadas.getPersona().getApellido(), llamadas.getPersona().getNombre(), llamadas.getPersona().getDni(), llamadas.getPersona().getDomicilio(), llamadas.getNivel(), llamadas.getListaSintoma().size(), (dia+"/"+mes+"/"+anio), llamadas.getRecurso().getClass().getName().substring(7)});
        }
    }
    
    
    public String obtenerRecursoSintoma (JTable jt){
     String recursoAsignado = "";   
     int recursoNivel = obtenerMayorNivelSintoma(jt);
        
     
        for(Nivel niveles : persistencia.niveles){          
            if(niveles.getNumeroNivel()== recursoNivel){
                recursoAsignado = niveles.getRecurso().getTipo();
            }
        }
        
        
    
    
     return recursoAsignado;   
    }
    
    
}