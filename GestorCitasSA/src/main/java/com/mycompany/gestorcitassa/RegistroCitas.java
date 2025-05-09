
package com.mycompany.gestorcitassa;

public class RegistroCitas {
   
    //Atributos    
    
    private int ID;
    private String Fecha;
    private Paciente Paciente;
    private Doctor Doctor;
    private String Estado;
    
    //Un RegistroCitas contiene a un paciente
    public Paciente contiene;    
   
    //Un RegistroCitas genera un ticket
    public Ticket genera;  
    
    //Metodos    
    public void Crear_Cita(){
        System.out.println("Cita Creada");
       
    }
    
    public void Modificar_Cita(){
        System.out.println("Cita Modificada");
       
    }

    public void Cancelar_cita(){
        System.out.println("Cita Cancelada");
    }
}
