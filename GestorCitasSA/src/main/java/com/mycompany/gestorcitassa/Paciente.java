
package com.mycompany.gestorcitassa;

//ATRIBUTOS

import java.util.ArrayList;


public class Paciente {
    private String DNI;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private int edad;
    private String telefono;
    private String correo;
    private String direccion;
    private String Contrasena;
    private String SeguroMedico;
    
    //Un paciente es atendido por un doctor
    public Doctor es_atendido;
    
    //paciente puede tener uno o mas RegistroCitas
    private ArrayList<RegistroCitas> Tiene = new ArrayList();
    
    //paciente puede tener uno o mas Metodopago
    private ArrayList<MetodoPago> Se_asocia = new ArrayList();
        
    //Metodos
    
     public void Agendar_Cita(){
        System.out.println("Cita Agendada");
    
     }
     public void Cancelar_Cita(){
        System.out.println("cita cancelada");
    
     } 
     public void Actualizar_Datos(){
        System.out.println("Datos Actualizados");
    
     }     
}
