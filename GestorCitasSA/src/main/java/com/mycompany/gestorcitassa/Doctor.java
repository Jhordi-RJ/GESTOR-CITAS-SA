
package com.mycompany.gestorcitassa;

public class Doctor {
   
    //ATRIBUTOS
    
    private int ID;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int Celular;
    private int Consultorio;
    private String Especialidad;
    private String Horario;
    private int Experiencia;
    private String Contrasena;
    private String Correo;
    
    ///Un doctor atiende a un Paciente
    public Paciente es_atendido;    
    
    //Metodos

     public void Atender_Paciente(){
        System.out.println("Cita Atendida");
    
     }
     
     public void Actualizar_Horario(){
        System.out.println("Horario Actualizado");
    
     }     
     
     public void Consultar_Cita(){
        System.out.println("Detalles de cita");
    
     } 
}