package ManejoArchivos;

public class Persona {
    private String nombre;
    private int edad;
    //(C: casado, S:soltero, V: viudo, D:divorciado)
    private char estadoCivil;
    private String DNI;
    
    //metodo constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, char estadoCivil, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.DNI = DNI;
    }
    
    //metodos get-set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + ";" + this.getEdad() + ";" + 
                this.getEstadoCivil() + ";" + this.getDNI();
    }
}
