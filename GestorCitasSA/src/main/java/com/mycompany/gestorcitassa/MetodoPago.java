
package com.mycompany.gestorcitassa;

public class MetodoPago {
  
    //Atributos
    
    private int ID;
    private char MetodoPago;
    private Double Monto;
    private String Estado;
 
    //Un MetodoPago esta asociado a un Ticket
    public Ticket se_asocia;
    
    //Un metodopago tiene a un paciente
    
    public Paciente tiene;
    
    //Metodos
    
    public void Procesar_Pago(){
        System.out.println("Pago Procesado");
    }
            
     public void Generar_Recibo(){
        System.out.println("Recibo Generado");
    }
        
    public void Verificar_Estado(){
        System.out.println("Estado de Pago");
    }
             
}
