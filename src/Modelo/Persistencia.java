
package Modelo;

import Modelo.*;
import static Modelo.EstadoRecurso.activo;
import java.util.ArrayList;


public class Persistencia {
    public ArrayList<Sintoma> sintomas = new ArrayList();
    public ArrayList<Persona> personas = new ArrayList();
    public ArrayList<Recurso> recursos = new ArrayList();
    public ArrayList<Llamada> llamadas = new ArrayList();
    public ArrayList<Nivel> niveles = new ArrayList();
        
    private Sintoma sintoma;
    private Turno turno;
    private Medico medico;
    private Ambulancia ambulancia;
    private Nivel nivel1;
    private Nivel nivel2;
    private Nivel nivel3;
    private Persona paciente;
    private Llamada llamada;
        
    public Persistencia(){
        
        llamadas = new ArrayList<Llamada>();
        niveles = new ArrayList<Nivel>();
        sintomas = new ArrayList<Sintoma>();
        
        iniciarNiveles();
        iniciarSintomas();
    }
    
     public void iniciarSintomas(){
        sintoma = new Sintoma("Tos seca", 1);
        nivel1.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Dolor muscular", 1);
        nivel1.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Dolor en las articulaciones", 1);
        nivel1.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Dolor de garganta", 1);
        nivel1.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Fatiga", 1);
        nivel1.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Fiebre", 2);
        nivel2.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Nauseas", 2);
        nivel2.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Vomitos", 2);
        nivel2.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Dolor de cabeza", 2);
        nivel2.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Escalofrios", 2);
        nivel2.addSintomas(sintoma);
        sintomas.add(sintoma);
        
        sintoma = new Sintoma("Dificultad para respirar", 3);
        nivel3.addSintomas(sintoma);
        sintomas.add(sintoma); 
    }
    
    public void iniciarNiveles(){
        
        recursos = new ArrayList<Recurso>();
        nivel1 = new Nivel("Nivel 1", 1);
                        
        turno = new Turno();
        turno.setEstado(EstadoRecurso.activo);
        turno.setDiaTurno("05/05/2020");
        turno.setHoraTurno("10:00");
        turno.setNroTelefono("(381) - 123456");
        turno.setTipo("Turno");
        recursos.add(turno);
        
        turno = new Turno();
        turno.setEstado(EstadoRecurso.activo);
        turno.setDiaTurno("06/05/2020");
        turno.setHoraTurno("10:30");
        turno.setNroTelefono("(381) - 123456");
        turno.setTipo("Turno");
        recursos.add(turno);
        
        turno = new Turno();
        turno.setEstado(EstadoRecurso.activo);
        turno.setDiaTurno("07/05/2020");
        turno.setHoraTurno("11:00");
        turno.setNroTelefono("(381) - 123456");
        turno.setTipo("Turno");
        recursos.add(turno);
        
        nivel1.setRecurso(turno);
        
        
        recursos = new ArrayList<Recurso>();
        nivel2 = new Nivel("Nivel 2", 2);
        
        medico = new Medico();
        medico.setEstado(EstadoRecurso.activo);
        medico.setNombreMedico("Dr. 1");
        medico.setNroInterno(381654321);
        medico.setTipo("Medico");
        recursos.add(medico);
        
        medico = new Medico();
        medico.setEstado(EstadoRecurso.activo);
        medico.setNombreMedico("Dr. 2");
        medico.setNroInterno(381654321);
        medico.setTipo("Medico");
        recursos.add(medico);
        
        medico = new Medico();
        medico.setEstado(EstadoRecurso.activo);
        medico.setNombreMedico("Dr. 3");
        medico.setNroInterno(381654321);
        medico.setTipo("Medico");
        recursos.add(medico);
        
        nivel2.setRecurso(medico);
        
        
        recursos = new ArrayList<Recurso>();
        nivel3 = new Nivel("Nivel 3", 3);
        
        ambulancia = new Ambulancia();
        ambulancia.setEstado(EstadoRecurso.activo);
        ambulancia.setNroAmbulancia(001);
        ambulancia.setTipo("Ambulancia");
        recursos.add(ambulancia);
        
        ambulancia = new Ambulancia();
        ambulancia.setEstado(EstadoRecurso.activo);
        ambulancia.setNroAmbulancia(002);
        ambulancia.setTipo("Ambulancia");
        recursos.add(ambulancia);
        
        ambulancia = new Ambulancia();
        ambulancia.setEstado(EstadoRecurso.activo);
        ambulancia.setNroAmbulancia(003);
        ambulancia.setTipo("Ambulancia");
        recursos.add(ambulancia);
        
        nivel3.setRecurso(ambulancia);
        
        niveles.add(nivel1);
        niveles.add(nivel2);
        niveles.add(nivel3);
    }
}