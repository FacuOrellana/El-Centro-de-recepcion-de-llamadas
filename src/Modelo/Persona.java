package Modelo;


public class Persona {
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String telefono;
    
    public Persona(int dni, String apellido, String nombre, String domicilio, String telefono){
        this.dni=dni;
        this.apellido=apellido;
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.telefono=telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}