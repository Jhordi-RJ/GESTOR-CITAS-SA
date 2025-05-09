
package com.mycompany.gestorcitassa;

import java.util.ArrayList;

public class Ticket {

    //Atributos
    
    private int ID;
    private Double Monto;
    private String Producto;
    private String Fecha;
    
    //un Ticket puede tener de uno a mas metodos de pago
    private ArrayList<MetodoPago> tiene = new ArrayList();
    
    //Un Ticket pertenece a un RegisttroCitas
    public RegistroCitas pertenece;
    
       
    //Metodos
    
    public void Visualizar_Ticket(){
        System.out.println("Datos de ticket");
    
    }
    
}


